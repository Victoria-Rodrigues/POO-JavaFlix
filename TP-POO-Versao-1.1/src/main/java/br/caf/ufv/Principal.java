package br.caf.ufv;

import br.caf.ufv.Conexao.Conexao;
import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoJaCadastrado;
import br.caf.ufv.visao.TelaCadastrarCliente;
import br.caf.ufv.visao.TelaPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal{

   public static void main(String[] args) throws ExcecaoJaCadastrado, SQLException {
        
       Scanner scan = new Scanner(System.in);      
       TelaCadastrarCliente telaCadastro = new TelaCadastrarCliente();
       TelaPrincipal telaPrincipal = new TelaPrincipal();
       Connection conexao = Conexao.getConnection();
       while(true){
           
           System.out.println("===================================");
           System.out.println("==========MENU PRINCIPAL===========");
           System.out.println("===================================");
           System.out.println("[1] Cadastrar cliente");
           System.out.println("[2] Modo Entrada");
           System.out.println("[0] Sair");
           int op;
           
           try{
              System.out.println("Digite: ");
              op = scan.nextInt();
              if(op==0)break;
              else if(op==1)telaCadastro.mostrar();
              else if(op==2)telaPrincipal.mostrar();
              else System.out.println("Entrada inválida!");
            }catch (InputMismatchException e){
              System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
              scan.nextLine(); //descarta a entrada errada do usuário
            }finally{
              System.out.println("Operação encerrada!");
            }       
       }
       
    }
}
