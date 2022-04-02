package br.caf.ufv.visao;

import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.Cliente;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoDiferenteDeZeroUm;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoProdutoNaoExiste;
import br.caf.ufv.modelo.persistencia.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCliente {
    Scanner s = new Scanner(System.in).useDelimiter("\n");;

    TelaCompra telaCompra = new TelaCompra();
    TelaPerfil telaPerfil = new TelaPerfil();
    public void mostrar(Cliente cliente){
        while(true){
            try {
                System.out.println("=============================");
                System.out.println("===========JAVAFLIX==========");
                System.out.println("=============================");
                ControleCliente controle = new ControleCliente();
                Cliente c = controle.pesquisa(cliente.getCpf());
                System.out.println("Olá, "+c.getNome());
                System.out.println("[1] Buscar produto");
                System.out.println("[2] Adicinar item no carrinho");
                System.out.println("[3] Remover item do carrinho");
                System.out.println("[4] Visualizar produtos no carrinho");
                System.out.println("[5] Finalizar compra");
                System.out.println("[6] Meu perfil");
                System.out.println("[0] Sair");
                System.out.println("Informe operação:");
                int op = s.nextInt();
                if(op==0){
                    System.out.println("Saindo modo cliente...");
                    cliente.clearCarrinho();//Esvaziando carrinho quando usuario sair do sistema!
                    break;
                }
                switch(op){
                    case 1:
                        operacao();
                        break;
                    case 2:
                        telaCompra.adicionarCarrinho(cliente);
                        break;
                    case 3:
                        telaCompra.removerItemCarrinho(cliente);
                        break;
                    case 4:
                        telaCompra.visualizarCarrinho(cliente);
                        break;
                    case 5:                    
                        TelaFinalizarPedido tela = new TelaFinalizarPedido();
                        tela.finalizarCompra(cliente);                   
                        break;
                    case 6:
                        telaPerfil.mostra(cliente);
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente");
                        break;
                }
            } catch (InputMismatchException e){
                  System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                   s.nextLine(); //descarta a entrada errada do usuário
            }catch(SQLException e){
                System.out.println(e.getSQLState());
            }

        }
        
        
    }

    public void operacao(){
        int op,mod;
        while(true){
            try{
                System.out.println("[1] Filme");
                System.out.println("[2] Serie");
                System.out.println("[0] Sair");
                System.out.println("Informe uma opção:");
                op = s.nextInt();
                if(op==0){
                    System.out.println("Saindo modo cliente...");
                    break;
                }
                switch(op){
                    case 1:
                        listarFilmes();
                        break;
                    case 2:                  
                        listarSeries();                  
                        break;

                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }
            }catch(InputMismatchException erro1){
                System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                s.nextLine(); //descarta a entrada errada do usuário
            }     
        }
    }
    
    public void listarFilmes() {
        try {   
            ControleProduto controle = new ControleProduto();
            controle.listarFilmes();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void listarSeries() {
        try {   
            ControleProduto controle = new ControleProduto();
            controle.listarSeries();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
