package br.caf.ufv.modelo.entidade;

public class Produto{
  private int idProduto;//CODIGO DE IDENTIFICAÇÃO DO PRODUTO
  private int identificador;//SERIE[0] - FILME[1]
  private String titulo;
  private float duracao;
  private String descricao;
  public int tipoLegenda; //Dublado[0] - Legendado[1]
  private float preco;
  private int quantidade;
 
  

  public Produto(int idProduto,int identificador,String titulo, float duracao, float preco, String descricao, int tipoLegenda,int quantidade){
    this.idProduto = idProduto;
    this.identificador = identificador;
    this.preco = preco;
    this.descricao = descricao;
    this.titulo = titulo;
    this.duracao = duracao;
    this.tipoLegenda = tipoLegenda;
    this.quantidade = quantidade;
  }

    @Override
    public String toString() {
        return 
        "\n==============================================\n"+
        "Código:"+this.idProduto+
        "\nTítulo:"+this.titulo+
        "\nSinopse:"+this.descricao+
        "\nDuração:"+this.duracao+
        "\nQuantidade:"+this.quantidade+
        "\nPreço: R$ "+this.preco+
        "\n==============================================\n";
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public int getIdentificador() {
        return this.identificador;
    }
    
    public int getIdProduto() {
        return this.idProduto;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public float getDuracao() {
        return this.duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTipoLegenda() {
        return this.tipoLegenda;
    }
    
    public float getPreco() {
        return this.preco;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoLegenda(int tipo) {
        this.tipoLegenda = tipo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
  
}
