package br.caf.ufv.visao;
import br.caf.ufv.Validacao.ValidaCPF;
import br.caf.ufv.controle.ControleAdm;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoJaCadastrado;
import java.util.Scanner;

public class TelaCadastrarAdm {
    
   /* public void mostrar(ControleAdm controleAdm) throws ExcecaoJaCadastrado{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("        CADASTRO");
        System.out.println("================================");
        boolean continua = true;
        do{
            try{
            System.out.println("Nome completo:");
            String nome = scan.nextLine();
            System.out.println("CPF(sem simbolos ou pontos, somente os números):");
            String cpf = scan.nextLine();  
            if (ValidaCPF.isCPF(cpf) == true){
                System.out.println("Senha:");
                String senha = scan.nextLine();
                controleAdm.inserirAdministrador(cpf, nome);
            }
            else{
                System.err.println("Erro, CPF inválido. Informe os dados corretamente!");
            }
            }catch(ExcecaoJaCadastrado e){
                System.out.println(e.getMessage());     
            }
        }while(continua); 
    }*/
}
