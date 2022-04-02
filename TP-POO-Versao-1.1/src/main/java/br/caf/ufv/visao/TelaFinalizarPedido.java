
package br.caf.ufv.visao;

import br.caf.ufv.controle.ControleCompra;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.Cliente;
import br.caf.ufv.modelo.entidade.Compra;
import br.caf.ufv.modelo.entidade.Produto;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoProdutoNaoExiste;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaFinalizarPedido {
    public void finalizarCompra(Cliente cliente){
        Scanner s = new Scanner(System.in);
        ArrayList<Compra> produtos = cliente.listar();
        
        boolean flag = false;
        float totalCompra = 0;
        System.out.println("==================================");
        System.out.println("        LISTA DE COMPRAS");
        System.out.println("==================================");
        try {
            for(Compra c: produtos){
                flag = true;
                ControleProduto controleProduto = new ControleProduto();
                Produto p = controleProduto.pesquisa(c.getCodProduto());          
                if(p != null){
                    System.out.println("Produto:" + p.getTitulo());
                    System.out.println("["+p.getIdProduto()+"] - "+"Qtd: "+c.getQuantidade()+ "- R$"+ c.getQuantidade()*p.getPreco());
                    totalCompra += c.getQuantidade()*p.getPreco();
                    System.out.println("-------------------------------------------------------------------");
                }
            }
        }catch(SQLException e){
            
        }
        
        boolean verifica;
        if(flag){
            try{
                System.out.println("TOTAL: R$"+ totalCompra);
                System.out.println("Deseja finalizar compra? [1]Sim - [2]Não");
                int op = s.nextInt();
                ControleProduto controleProduto = new ControleProduto();
                if(op==1){
                    ControleCompra controleCompra = new ControleCompra();
                    for(Compra c: produtos){
                        Produto p = controleProduto.pesquisa(c.getCodProduto());
                        
                        p.setQuantidade(p.getQuantidade() - c.getQuantidade());
                        controleCompra.inserirProduto(cliente.getCpf(),p.getIdProduto(),c.getQuantidade(), c.getTotal()); //add lista de compras do cliente              
                        
                        if(p.getQuantidade() == 0){
                            controleProduto.deletarProduto(p);//removendo produto do estoque
                           
                        }else{
                            controleProduto.alterar(p.getIdProduto(), p.getQuantidade());//atualizando estoque
                           
                        }
                        
                    }
                    cliente.clearCarrinho();
                    System.out.println("Compra finalizada com sucesso!");
                } 
            }catch(InputMismatchException erro1){
                System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                s.nextLine(); //descarta a entrada errada do usuário
            }catch(SQLException e){
                System.out.println("Erro banco de dados");
            }  
        }else{
            System.out.println("Não existe nenhum produto na sua lista de compras!");
        }
    }
}
