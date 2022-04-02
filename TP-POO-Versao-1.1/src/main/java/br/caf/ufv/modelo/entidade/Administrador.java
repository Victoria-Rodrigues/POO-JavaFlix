
package br.caf.ufv.modelo.entidade;

import br.caf.ufv.modelo.entidade.Pessoa;

public class Administrador extends Pessoa implements EntidadeBase{

    public Administrador(String cpf, String nome, String senha) {
        super(cpf, nome,senha);
    }
    
    @Override
    public String toString(){
        return "Dados do Administrador\n"+ super.toString();
    }

    @Override
    public String getId() {
        return getCpf();
    }
    
}
