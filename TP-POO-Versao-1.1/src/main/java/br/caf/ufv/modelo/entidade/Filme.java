package br.caf.ufv.modelo.entidade;

import br.caf.ufv.modelo.entidade.Produto;
import java.util.ArrayList;

public class Filme extends Produto{

    public Filme(int idProduto, int identificador, String titulo, float duracao, float preco, String descricao, int tipoLegenda, int quantidade) {
        super(idProduto, identificador, titulo, duracao, preco, descricao, tipoLegenda, quantidade);
    }
    
}