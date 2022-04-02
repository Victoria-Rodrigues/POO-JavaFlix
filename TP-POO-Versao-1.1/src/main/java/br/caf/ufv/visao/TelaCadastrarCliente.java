package br.caf.ufv.visao;
import br.caf.ufv.Validacao.ValidaCPF;
import br.caf.ufv.controle.ControleCliente;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoJaCadastrado;
import java.sql.SQLException;
import java.util.Scanner;

public class TelaCadastrarCliente {
    
    public void mostrar(){   
        
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.println("================================");
            System.out.println("        CADASTRO");
            System.out.println("================================");
            System.out.println("Nome completo:");
            String nome = scan.nextLine();
            System.out.println("CPF(sem simbolos ou pontos, somente os números):");
            String cpf = scan.nextLine();  
            System.out.println("Senha:");
            ControleCliente controleCliente = new ControleCliente();
            String senha = scan.nextLine(); 
            if (ValidaCPF.isCPF(cpf) == true)
               controleCliente.inserirCliente(cpf, nome,senha);
            else System.err.println("Erro, CPF inválido. Informe os dados corretamente!");   
        }catch(ExcecaoJaCadastrado e){       
                System.out.println(e.getMessage());     
        }catch(SQLException erro){
            System.out.println("Erro banco de dados");
        }
    }
}
