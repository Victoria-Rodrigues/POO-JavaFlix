package br.caf.ufv.modelo.entidade;
        
public enum Categorias{
    ACAO("Ação"),
    AVENTURA("Aventura"),
    COMEDIA("Comedia"),
    ROMANTICO("Romantico"),
    FANTASIA("Fantasia"),
    FICCAO("Ficção Cientifica"),
    TERROR("Terror");

    private String categoria;

    Categorias(String categoria){
      this.categoria = categoria;
    }
    public String getCatagoria(){
      return categoria;
    }
        
} 

