package br.caf.ufv.modelo.entidade.excecao;

public class ExcecaoDiferenteDeZeroUm extends Exception{

    public String getMessege() {
        return "Valor incorreto. Deve ser 1 ou 0.";
    }
    
}
