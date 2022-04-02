package br.caf.ufv.visao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaPrincipal {
    
    public void mostrar() {
        Scanner scan = new Scanner(System.in);
        int op;
        TelaLoginCliente telaLoginCliente = new TelaLoginCliente();
        TelaAdministrador telaAdm = new TelaAdministrador();

        while(true){
            try {
                System.out.println("====================================");
                System.out.println("            MODO DE ENTRADA         ");
                System.out.println("====================================");
                System.out.println("[1] Administrador");
                System.out.println("[2] Cliente");
                System.out.println("[0] Sair");
                System.out.println("Digite:");
                op = scan.nextInt();
                if(op == 0){
                    System.out.println("Saindo...");
                    break;
                }
                else if(op == 1){
                    telaAdm.mostrar();
                }else if(op==2){
                    telaLoginCliente.mostrar();
                }else{
                    System.out.println("Opção inválida!");
                } 
            } catch (InputMismatchException e){
                  System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                   scan.nextLine(); //descarta a entrada errada do usuário
            }          
        }   
    }
}
