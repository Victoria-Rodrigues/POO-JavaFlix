package br.caf.ufv.visao;

import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoDiferenteDeZeroUm;
import java.util.InputMismatchException;
import java.util.Scanner;

class TelaAdministrador {
    public void mostrar(){
        Scanner scan = new Scanner(System.in);       
        TelaProduto telaProduto = new TelaProduto(); 
        
        while(true){
            System.out.println("==============================");
            System.out.println("       MODO ADMINISTRADOR     ");
            System.out.println("==============================");
            
            System.out.println("[1] Inserir um novo produto");
            System.out.println("[2] Remover um produto");
            System.out.println("[3] Visualizar estoque");
            System.out.println("[4] Pesquisar um produto");
            System.out.println("[5] Lista dos clientes da loja");
            System.out.println("[0] Sair");
            try{
                System.out.println("Digite:");
                int op = scan.nextInt();
                if(op == 0)break;
                switch(op){
                    case 1:                      
                        telaProduto.inserir();                                               
                        break;
                    case 2:
                        telaProduto.remove();
                        break;
                    case 3:
                        telaProduto.listarProdutos();
                        break;
                    case 4:
                        telaProduto.pesquisarProduto();
                        break;
                    case 5:
                        telaProduto.listarClientes();
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        break;
                }    
            }catch (InputMismatchException e){
              System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
              scan.nextLine(); //descarta a entrada errada do usuário
            }
            
        }
    }
}
