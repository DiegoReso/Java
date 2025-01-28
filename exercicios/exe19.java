package exercicios;

import java.util.Arrays;

public class exe19 {
    public static void main(String[] args) {
        
        //minha resolucao
        int [] numeros = {1,2,3};

       for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
       }

       System.out.println("Array invertido");

       for (int j = numeros.length -1 ; j >= 0 ; j--) {
            System.out.println(numeros[j]);
       }

       //resolucao professor

       int [] numerosCopy = new int[numeros.length];

       for (int i = 0; i < numerosCopy.length; i++) {
        numerosCopy[i] = numeros[numeros.length - 1 - i];

       }

       System.out.println("Array invertido professor");
       System.out.println(Arrays.toString(numerosCopy));




    }   
}
