package br.caf.ufv.modelo.entidade;
import java.util.Date;

public class Compra{
  private String cpf;
  private int quantidade;//Quantidade de produtos que deseja comprar
  private int codProduto;//Saber qual produto o cliente deseja comprar
  private Date dataAquisicaoProduto;//Data da compra do produto
  private float total;
    public Compra(String cpf, int codProduto,int quantidade, float total) {
        dataAquisicaoProduto = new Date();
        this.quantidade = quantidade;
        this.codProduto = codProduto;
        this.cpf = cpf;
        this.total = total;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public int getCodProduto() {
        return this.codProduto;
    }

    public Date getDataAquisicaoProduto() {
        return this.dataAquisicaoProduto;
    }
    
  @Override
    public String toString() {
        return 
        "\n==============================================\n"+
        "Código:"+this.codProduto+
        "\nQuantidade:"+this.quantidade+
        "\n==============================================\n";
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCpf() {
        return cpf;
    }
   
}
