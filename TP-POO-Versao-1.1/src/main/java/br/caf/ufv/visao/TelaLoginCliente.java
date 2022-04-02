
package br.caf.ufv.visao;
import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.Cliente;
import java.util.Scanner;

public class TelaLoginCliente {
    public void mostrar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu cpf para logar:");
        String idnum = scan.nextLine();
        System.out.println("Informe sua senha:");
        String senha = scan.nextLine();
   
        try {
            ControleCliente controleCliente = new ControleCliente();
            Cliente cliente = controleCliente.pesquisa(idnum);
           
            if(cliente!=null){
                if(idnum.equals(cliente.getCpf()) && senha.equals(cliente.getSenha())){
                    TelaCliente telaCliente = new TelaCliente();
                    telaCliente.mostrar(cliente);
                }else{
                    System.out.println("Usuário ou senha incorreta!");
                }
            }else{
                System.out.println("Cliente não cadastrado!");
            }
        } catch (Exception e) {
            System.out.println("falhou");
        }   
    }
    
    
}
