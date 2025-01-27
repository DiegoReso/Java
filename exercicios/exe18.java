package exercicios;

import constante.constante;

public class exe18 {
    public static void main(String[] args) {
        
        int numeroParaContar = 163645;
        int contador = 0;

        while (numeroParaContar !=0) {

            numeroParaContar /= 10;

            contador++;
            
        }

        System.out.println("Numero de " + contador + " digitos!");
        
    }
}
