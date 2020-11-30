package br.ifsudestemg.poswebmobile.denispereiraraymundo.alfabetohash;

public class Hash {                                  
    Lista[] vetor; 
    String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ*";
    int maxLista = alfabeto.length();                                      

    Hash() {                                                     
        vetor = new Lista[maxLista];                    
        for (int i = 0; i < maxLista; i++) {            
            vetor[i] = new Lista();                     
        }
    }

    int CalcularHash(String chave) {
        chave = chave.trim().toUpperCase();
        int pos = alfabeto.indexOf(chave.charAt(0));
        if (pos == -1) {pos = maxLista -1;};
        return pos;
    }

    void inserir(ChaveValor chaveValor) {                     
        int indice = CalcularHash(chaveValor.getChave());          
        vetor[indice].inserir(chaveValor);                  
    }

    void put(String key, String value) {
        ChaveValor chaveValor = new ChaveValor(key, value);
        inserir(chaveValor);
    }

    ChaveValor get(String chave) {                        
        return vetor[CalcularHash(chave)].buscar(chave);
    }

    ChaveValor remove(String chave) {                        
        return vetor[CalcularHash(chave)].remove(chave);
    }

    boolean containsKey(String chave) {                        
        return vetor[CalcularHash(chave)].containsKey(chave);
    }

    public int size() {
        int tamanho = 0;
        for (int i = 0; i < maxLista; i++) {
            tamanho+=vetor[i].getTamanho();
        }
        return tamanho;
    }

    public String toString() {                          
        String out = "";                                
        for(int i = 0; i < maxLista; i++) {
            if (vetor[i].getTamanho() > 0) {             
              out += "" + alfabeto.charAt(i) + ": ";                       
              out += vetor[i] + "\n";
            }
        }
        return out;                                     
    }    
}
