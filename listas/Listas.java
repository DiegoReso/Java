package listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import constante.constante;

public class Listas {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,30,4,5,6,7,8,9};

        for (int i : numeros) {
            System.out.println("Cada numero do array: " + i);
        }

        int maior = numeros[8];
        int j = 0;

        while (j < numeros.length) {

            if(numeros[j] > maior){
                maior = numeros[j];
            }

            j++;
        }

        System.out.println("Maios numero eh " + maior);


        System.out.println(numeros[1]);

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println(soma);

        String [] frutas  = new String[3];
        frutas[0] = "maca";
        frutas[1] = "banana";
        frutas[2] = "pera";


        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        String [] palavras = {"Diego", "Reis", "de", "Souza"};
        String texto = "";

        for (String palavra : palavras) {
            texto += palavra + " ";
        }
        System.out.println(texto);


        char[] letras = {'a','b','c','d','e'};

        for (char letra : letras) {
            if( letra == 'c'){
                System.out.println("Letra c encontrada");
                continue;
            }

            System.out.println(letra);
        }

        for (int numero : numeros) {

            if(numero % 2 == 0){
                System.out.println(numero + " eh par!");
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros [i] *= 2;
        }

        for (int numero : numeros) {
            System.out.println("O array com o numero dobrado eh: " + numero);
            
        }

        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);

        //utilizando arraycopy para copiar elementos

        String[] novasFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0,novasFrutas,0, frutas.length);

        novasFrutas[novasFrutas.length -1] = "Jaca";

        System.out.println(Arrays.toString(novasFrutas));

        //usando arraylist

        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Limao", "Melao","Melancia"));

        System.out.println(listaFrutas);
        listaFrutas.add("Manga");
        
        System.out.println(listaFrutas);

        
    }
}
