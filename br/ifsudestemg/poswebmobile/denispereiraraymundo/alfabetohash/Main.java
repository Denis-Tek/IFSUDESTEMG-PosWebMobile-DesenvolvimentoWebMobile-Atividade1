package br.ifsudestemg.poswebmobile.denispereiraraymundo.alfabetohash;

public class Main {                                             
    public static void main(String [] args) {                   
        Hash hash = new Hash();                                
        hash.inserir(new ChaveValor("Saulo", "de Tarso"));      
        hash.inserir(new ChaveValor("Joao", "Batista"));
        hash.inserir(new ChaveValor("Marta", "de Betânia"));
        hash.inserir(new ChaveValor("Lázaro", "Amigo de Jesus"));
        hash.inserir(new ChaveValor("Maria", "Irmã de Lázaro"));
        hash.inserir(new ChaveValor("Adao", "Pecador"));
        hash.inserir(new ChaveValor("Zacarias", "Profeta"));
        hash.inserir(new ChaveValor("123aaaa", "Erro"));
        hash.inserir(new ChaveValor("Jesus", "de Nazaré"));

        System.out.println(hash);

        System.out.printf("Pessoas no mundo: %d \n", hash.size());

        if (hash.containsKey("Jesus")) {
            System.out.println("Jesus Nasceu!");
        }

        hash.remove("Jesus");

        System.out.printf("Pessoas no mundo: %d \n", hash.size());

        if (! hash.containsKey("Jesus")) {
            System.out.println("Jesus Morreu!");
        }
       
        hash.put("Jesus", "Cristo");
        hash.put("Espírito", "Santo");

        System.out.println(hash.get("Jesus").getValor() + " Ressuscitou!!!!!\n");

        System.out.println(hash);
    }
}