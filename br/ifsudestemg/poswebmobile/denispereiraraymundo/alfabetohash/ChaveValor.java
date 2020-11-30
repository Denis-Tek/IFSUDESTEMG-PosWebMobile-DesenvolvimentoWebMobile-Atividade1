package br.ifsudestemg.poswebmobile.denispereiraraymundo.alfabetohash;

public class ChaveValor {
    private String chave;
    private String valor;

    public String getChave() {return chave;}
    public String getValor() {return valor;}
    
    public void setChave(String value) {chave = value;}
    public void setValor(String value) {valor = value;}

    public ChaveValor(String chave, String valor){
        this.chave = chave;
        this.valor = valor;
    }
    
    public String toString() {							
		return "(" + chave + ": " + valor + ")";		
	}    
}
