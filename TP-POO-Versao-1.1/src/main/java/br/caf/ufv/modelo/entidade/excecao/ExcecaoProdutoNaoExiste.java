
package br.caf.ufv.modelo.entidade.excecao;

public class ExcecaoProdutoNaoExiste extends Exception{
    
    
    @Override
    public String getMessage() {
        return "Produto não existe!";
    }
    
}
