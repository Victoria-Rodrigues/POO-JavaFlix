package br.caf.ufv.visao;
import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.controle.ControleCompra;
import br.caf.ufv.modelo.entidade.Cliente;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPerfil {
    
    public void mostra(Cliente cliente){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            try {
                System.out.println("=================================");
                System.out.println("=============CLIENTE=============");
                System.out.println("=================================");
                ControleCliente controle = new ControleCliente();
                Cliente c = controle.pesquisa(cliente.getCpf());
                System.out.println("Olá, "+c.getNome());
                System.out.println("[1] Editar perfil");
                System.out.println("[2] Deletar conta");
                System.out.println("[3] Histórico das compras realizadas");
                System.out.println("[0] Voltar ao menu principal");
                System.out.println("Informe operação:");
                int op = scan.nextInt();
                if(op==0){
                    System.out.println("Saindo..");
                    break;
                }
                switch(op){
                    case 1:
                        edita(cliente);
                        break;
                    case 2:
                        deleta(cliente);
                        break;
                    case 3:
                        historico(cliente);
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente");
                        break;
                }
            }catch (InputMismatchException e){
                  System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                   scan.nextLine(); //descarta a entrada errada do usuário
            }catch(SQLException e){
                System.out.println(e.getSQLState());
            }
            
        }
        
    }

    public void edita(Cliente cliente){
        Scanner scan = new Scanner(System.in);
        while(true){
            try {
            ControleCliente controle = new ControleCliente();
            

            System.out.println("[1] Alterar nome:");
            System.out.println("[2] Alterar senha:");
            System.out.println("[0] Sair");
            String op = scan.nextLine();
            int opcao = Integer.parseInt(op);
            if(opcao==0){
                break;              
            }else if(opcao == 1){
                System.out.println("Insira o novo nome:");
                String nome = scan.nextLine();
                controle.updateNome(cliente, nome);
            }else if(opcao==2){
                System.out.println("Senha antiga:");
                String senhaAntiga = scan.nextLine();
                System.out.println("Nova senha:");
                String senhaNova = scan.nextLine();
                controle.updateSenha(cliente, senhaNova, senhaAntiga);
            }else{
                System.out.println("Opção invalida");
            }
            } catch (InputMismatchException e){
                  System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                   scan.nextLine(); //descarta a entrada errada do usuário
            }catch(SQLException e){
                System.out.println(e.getSQLState());
            }
        }
    }

    public void deleta(Cliente cliente){
        try {
            ControleCliente controleCliente = new ControleCliente();
            controleCliente.deletar(cliente);
            TelaPrincipal t = new TelaPrincipal();
            t.mostrar();
        } catch (Exception e) {
            System.out.println("erro:");
        }
        
    }
    
    public void historico(Cliente cliente){
        try {
            ControleCompra controleCompra = new ControleCompra();
            controleCompra.listar(cliente.getCpf());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
