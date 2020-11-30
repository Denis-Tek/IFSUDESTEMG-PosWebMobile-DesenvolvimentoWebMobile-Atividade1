package br.ifsudestemg.poswebmobile.denispereiraraymundo.alfabetohash;

public class Lista {
    private No inicio;                              
    private int tamanho;                            

    public void inserir(ChaveValor info) {     
        No no = new No();  

        no.info    = info;                     
        no.proximo = inicio;  

        inicio = no;                        
        tamanho++;                          
    }

    public ChaveValor buscar(String chave) {     
        No no = inicio;                     
        while (no != null) {                
            if (no.info.getChave() == chave) { 
                return no.info;             
            }
            no = no.proximo;                
        }
        return null;
    }

    public boolean containsKey(String chave) {     
        No no = inicio;                     
        while (no != null) {                
            if (no.info.getChave() == chave) { 
                return true;             
            }
            no = no.proximo;                
        }
        return false;
    }

    public ChaveValor remove(String chave) {     
        No no       = inicio;
        No anterior = inicio;                     
        while (no != null) {                
            if (no.info.getChave() == chave) {
                if (no == inicio) {
                    inicio = no.proximo;
                } else {
                    anterior.proximo = no.proximo;
                }
                tamanho--;  
                return no.info;           
            }
            no = no.proximo;                
        }
        return null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {              
        String out = "";                    
        No no = inicio;                     
        while (no != null) {                
            out += no.info + " ";           
            no = no.proximo;                
        }
        return out;                         
    }    
}
