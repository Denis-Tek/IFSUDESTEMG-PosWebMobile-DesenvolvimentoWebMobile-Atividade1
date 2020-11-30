package br.ifsudestemg.poswebmobile.denispereiraraymundo.crivodeeratostenes;

public class CrivoEratostenes {

    public static void main(String[] args) {
        boolean[] primos = crivoEratostenes(1000);
        mostrar(primos);
    }

    private static void mostrar(boolean[] primos) {
        for (int i = 2; i < primos.length; i++) {
        	if (primos[i]) {System.out.print( i + "\n");}
        }
    }

    private static boolean[] crivoEratostenes(int n) {
        int raiz = (int)Math.floor(Math.sqrt(n));
        
        boolean[] primos = new boolean[n + 1];
        
        for (int i = 2; i < n; i++) {primos[i] = true;}
        
        for (int i = 2; i <= raiz; i++) {
            if (primos[i]) {
                for (int j = i; i * j <= n; j++) {
                    primos[i * j] = false;
                }
            }
        }
        return primos;
    }
}