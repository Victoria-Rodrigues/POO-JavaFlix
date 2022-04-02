
package br.caf.ufv.controle;

import br.caf.ufv.modelo.entidade.Produto;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoProdutoNaoExiste;
import br.caf.ufv.modelo.persistencia.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class ControleProduto {
    private static final Logger LOGGER = Logger.getLogger("br.ufv.caf.locadora");
    private ProdutoDAO dao;
    public ControleProduto() throws SQLException{
        dao = new ProdutoDAO();
    }
    
    public void inserirProduto(int idProduto,int identificador,String titulo, float duracao,float preco, String descricao, int tipo, int quantidade){
        Produto produto = new Produto(idProduto,identificador,titulo, duracao,preco, descricao, tipo,quantidade);
        if(pesquisa(idProduto) == null){
            dao.inserir(produto);
        }else{
            JOptionPane.showMessageDialog(null, "Erro Inserir:Código já cadastrado no sistema!");
            LOGGER.warn("Produto já se encontra registrado no sistema!");
        } 
    }
    
    public Produto pesquisa(int idProduto){
        return dao.pesquisa(idProduto);
    }
        
    public boolean removerProduto(int idProduto){
        Produto p = pesquisa(idProduto);
        if(p != null){
            dao.remover(p);
            return true;
        }else{
            return false;
        }
    }
    
    public void deletarProduto(Produto p){
        Produto produto = pesquisa(p.getIdProduto());
        if(p != null){
            dao.removerAux(produto);
        }else{
            System.out.println("Deletar produto falho, nao achou o produto");
        }   
    }
    
    public void alterar(int idProduto, int quantidade){
        dao.update(idProduto, quantidade);
    }

    public Produto procurarProduto(int idProduto) throws ExcecaoProdutoNaoExiste{
        Produto p = pesquisa(idProduto);
        if(p == null){
            System.out.println("Código do produto não existente!");
            LOGGER.warn("Produto não existe!");
            throw new ExcecaoProdutoNaoExiste();
        }else{
            System.out.println("Produto encontrado no sistema");
            System.out.println(p.toString());
            LOGGER.info("Produto encontrado no sistema!");
        }
        return p;
    }
    
    public ArrayList<Produto>  Estoque(){  
        return dao.listarProdutos();
    }
    
    public void listarFilmes(){  
        for(int i=0; i<dao.listarProdutos().size();i++){
            if(dao.listarProdutos().get(i).getIdentificador() == 1){
                System.out.println("ID:"+dao.listarProdutos().get(i).getIdProduto());
                if(dao.listarProdutos().get(i).getTipoLegenda() == 0){
                    System.out.println("Dublado");
                }else{
                    System.out.println("Legendado");
                }
                System.out.println("Titulo:"+dao.listarProdutos().get(i).getTitulo());
                System.out.println("Sinopse:"+dao.listarProdutos().get(i).getDescricao());
                System.out.println("Preço:"+dao.listarProdutos().get(i).getPreco());
                System.out.println("Quantidade:"+dao.listarProdutos().get(i).getQuantidade());
                System.out.println("-----------------------------------------------");    
            }
        }
    }
    
    public void listarSeries(){
        for(int i=0; i<dao.listarProdutos().size();i++){
            if(dao.listarProdutos().get(i).getIdentificador() == 0){
                System.out.println("ID:"+dao.listarProdutos().get(i).getIdProduto());
                if(dao.listarProdutos().get(i).getTipoLegenda() == 0){
                    System.out.println("Dublado");
                }else{
                    System.out.println("Legendado");
                }
                System.out.println("Titulo:"+dao.listarProdutos().get(i).getTitulo());
                System.out.println("Sinopse:"+dao.listarProdutos().get(i).getDescricao());
                System.out.println("Preço:"+dao.listarProdutos().get(i).getPreco());
                System.out.println("Quantidade:"+dao.listarProdutos().get(i).getQuantidade());
                System.out.println("-----------------------------------------------");    
            }
        }
    }

        
    
}
