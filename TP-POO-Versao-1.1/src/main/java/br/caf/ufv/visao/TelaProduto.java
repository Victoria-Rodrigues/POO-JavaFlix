package br.caf.ufv.visao;

import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.Cliente;
import br.caf.ufv.modelo.entidade.Produto;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoDiferenteDeZeroUm;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoProdutoNaoExiste;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaProduto {
    Scanner scan = new Scanner(System.in);
   
    public void inserir(){
        
        try{
            ControleProduto controleProduto = new ControleProduto();
            System.out.println("Informe o código do produto:");
            int idProduto = scan.nextInt();
            System.out.println("Informe a quantidade:");
            int quantidade = scan.nextInt();

            System.out.println("Categoria - [0]Serie ou [1]Filme.Informe a opção:");
            int identificador = scan.nextInt();
            if(!(identificador == 0 || identificador == 1)){
                throw new ExcecaoDiferenteDeZeroUm();
            }
                
            System.out.println("Informe o preço: R$ ");
            float preco = scan.nextFloat();

            System.out.println("Disponível em: Dublado[0] ou Legendado[1].Informe a opção:");
            int tipoLegenda =scan.nextInt();
            if(!(tipoLegenda == 0 || tipoLegenda == 1)){
                throw new ExcecaoDiferenteDeZeroUm();
            }

            System.out.println("Título do produto:");
            String titulo = scan.next();

            scan.nextLine();
            System.out.println("Sinopse:");
            String descricao = scan.nextLine();

            System.out.println("Informe a duração em minutos:");
            float duracao = scan.nextFloat(); 
            
            controleProduto.inserirProduto(idProduto,identificador,titulo,duracao,preco, descricao, tipoLegenda, quantidade);
        }catch(InputMismatchException erro1){
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            scan.nextLine(); //descarta a entrada errada do usuário
        }catch(ExcecaoDiferenteDeZeroUm e){
            System.out.println(e.getMessege());
        }catch(SQLException erro){
            System.out.println("Erro na inicialiazação controle produto!");
        }
        

        
    }

    public void listarProdutos() {
        try {   
            ControleProduto controle = new ControleProduto();
            ArrayList<Produto> p = controle.Estoque();
            for(int i=0; i<p.size();i++){
                System.out.println("ID:"+p.get(i).getIdProduto());
                System.out.println("ID:"+p.get(i).getTitulo());

                if(p.get(i).getIdentificador() == 0){
                    System.out.println("Categoria: Serie");
                }else{
                    System.out.println("Categoria: Filme");
                }
                if(p.get(i).getTipoLegenda() == 0){
                    System.out.println("Dublado");
                }else{
                    System.out.println("Legendado");
                }
                System.out.println("Preço:"+p.get(i).getPreco());
                System.out.println("Quantidade:"+p.get(i).getQuantidade());
                System.out.println("-----------------------------------------------");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void pesquisarProduto() {
        
        try{
            ControleProduto controleProduto = new ControleProduto();
            System.out.println("Informe o código do produto:");
            int idProduto = scan.nextInt();
            controleProduto.procurarProduto(idProduto);
        }catch(ExcecaoProdutoNaoExiste ene){
            System.out.println("Código inválido do produto!");
        }catch(InputMismatchException erro1){
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            scan.nextLine(); //descarta a entrada errada do usuário
        }catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarClientes() {
        try {
            ControleCliente controleCliente = new ControleCliente();
            ArrayList<Cliente> lista = controleCliente.listar();
            for(int i =0; i<lista.size();i++){
                System.out.println(lista.get(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void remove() {
        try{
            ControleProduto controleProduto = new ControleProduto();
            System.out.println("Código do produto:");
            int idProduto = scan.nextInt();
            boolean verifica = controleProduto.removerProduto(idProduto); 
            if(verifica){
                System.out.println("Removido com sucesso!");
            }else{
                System.out.println("Código inválido!Produto não encontrado!");
            }
        }catch(InputMismatchException erro1){
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            scan.nextLine(); //descarta a entrada errada do usuário
        }catch (SQLException e){
            System.out.println("Erro SQL");
        }
               
    }
}
