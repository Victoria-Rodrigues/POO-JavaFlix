package br.caf.ufv.modelo.entidade;

import java.util.ArrayList;

public class Serie extends Produto{

    public Serie(int idProduto, int identificador, String titulo, float duracao, float preco, String descricao, int tipoLegenda, int quantidade) {
        super(idProduto, identificador, titulo, duracao, preco, descricao, tipoLegenda, quantidade);
    }
}
