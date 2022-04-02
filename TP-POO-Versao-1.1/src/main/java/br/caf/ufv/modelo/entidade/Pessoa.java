 package br.caf.ufv.modelo.entidade;

public class Pessoa {

  private String nome;
  private String cpf;
  private String senha;

  public Pessoa(String cpf, String nome,String senha){
    this.nome = nome;
    this.cpf = cpf;
    this.senha = senha;
  }

  @Override
  public String toString(){
      return "\nNome:"+this.nome+
              "\nCPF:"+this.cpf+"\n";
  }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
  
    public String getSenha() {
        return senha;
    }
  
}
