package br.caf.ufv.modelo.entidade;

public enum TipoLegenda{
    LEGENDADO("Legendado"),
    DUBLADO("Dublado");

    private String tipo;

    TipoLegenda(String tipo){
      this.tipo = tipo;
    }
    
    public String getLegendadoDublado(){
      return tipo;
    }
}
 

