
package br.caf.ufv.modelo.entidade.excecao;

public class ExcecaoJaCadastrado extends Exception{
    
   
    @Override
    public String getMessage() {
        return "Usuário já cadastrado!";
    }
    
}
