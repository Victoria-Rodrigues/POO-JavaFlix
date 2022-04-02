package br.caf.ufv.visao;

//import br.caf.ufv.controle.ControleCompra;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.Cliente;
import br.caf.ufv.modelo.entidade.Compra;
import br.caf.ufv.modelo.entidade.Produto;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoProdutoNaoExiste;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCompra {
    
    private Scanner s = new Scanner(System.in).useDelimiter("\n");
         
    public void adicionarCarrinho(Cliente cliente){
        try{
           System.out.println("Codigo do produto:");
            int idProduto = s.nextInt();
            System.out.println("Quantidade:");
            int quantidade = s.nextInt(); 
            Compra compra = cliente.pesquisa(idProduto);
            if(compra != null){
                ControleProduto controleProduto;             
                try {
                    controleProduto = new ControleProduto();
                    Produto p = controleProduto.pesquisa(idProduto); 
                   if((compra.getQuantidade() + quantidade)<= p.getQuantidade()){
                        compra.setQuantidade(compra.getQuantidade() + quantidade);
                        compra.setTotal(compra.getTotal()+quantidade*p.getPreco());
                        System.out.println("Produto inserido com sucesso!");
                    }else{
                       int result = p.getQuantidade() - compra.getQuantidade(); 
                       if(result!=0)
                            System.out.println("Há somente "+result+" produtos dísponiveis!");                  
                       else{
                           System.out.println("Não há mais produtos disponiveis!");
                       }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCompra.class.getName()).log(Level.SEVERE, null, ex);
                }          
            }else{
                cliente.inserirListaCompra(cliente,idProduto, quantidade);          
            }
        }catch (InputMismatchException e){
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
             s.nextLine(); //descarta a entrada errada do usuário
        }    
        
    }

    public void visualizarCarrinho(Cliente cliente) {
        ArrayList<Compra> produtos = cliente.listar();
        boolean flag = false;
        for(Compra p: produtos){
            System.out.println(p);
            flag = true;
        }
        if(!flag){
            System.out.println("Carrinho vazio!");
        }
    }

    public void removerItemCarrinho(Cliente cliente) {
        System.out.println("Codigo do produto que deseja remover:");
        int idProduto = s.nextInt();

        if(auxRemove(cliente, idProduto)){
            System.out.println("Item removido com sucesso!");
        }else{
            System.out.println("Item não encontrado!");
        }      
    }
    
    public boolean auxRemove(Cliente cliente, int idProduto){
        ArrayList<Compra> produtos = cliente.listar();
        for(Compra p: produtos){
            if(p.getCodProduto() == idProduto){
                if(cliente.removerItem(idProduto)){
                    return true;
                }
            }
        }
        return false;
    }
    
}
