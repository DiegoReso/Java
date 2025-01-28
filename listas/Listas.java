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

        //reference trap

        int[] arrayOriginal = {1,2,3};
        //int[] arrayCopia = arrayOriginal;

       // arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));

        //como evitar
        int[] arrayClone = arrayOriginal.clone();
        arrayClone[0] = 50;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));

        //arrays 2d

        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(matriz[0][2]);

        //criando array 2d vazio e preenchendo

        int [][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for (int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }


        int [][] grade = new int[4][5];

        

        for (int i = 0; i < grade.length; i++) {
            
            for (int k = 0; k < grade[i].length; k++) {
                grade[i][k] = i * k;
            }
        }

        System.out.println("grade");
        for (int[] grad : grade) {
            System.out.println(Arrays.toString(grad));
        }


        int [][] matrizTeste = new int[2][2];

        matrizTeste [0][0] = 1;
        matrizTeste [0][1] = 2;
        matrizTeste [1][0] = 3;
        matrizTeste [1][1] = 4;
        

        for (int i = 0; i < matrizTeste.length; i++) {
            
            for (int k = 0; k < matrizTeste[i].length; k++) {
                System.out.println(matrizTeste[i][k]);
            }
        }
    }
}
