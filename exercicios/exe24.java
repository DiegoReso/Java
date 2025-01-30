package exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class exe24 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        int[] listArray = {9,5,6,7};
        
        System.out.println(encontrarMaiorNumero(list));
        System.out.println(encontrarMaiorNumero(listArray));


    }

    public static int encontrarMaiorNumero(ArrayList<Integer> numeros){

        Integer maior = numeros.get(0);

            for (Integer numero : numeros) {
                 if(numero > maior){
                    maior = numero;
                 }
            }

            return maior;

    }
    
    //executando com array

    public static int encontrarMaiorNumero(int[] numeros){

       int maior = numeros[0];

       for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior){
                maior = numeros[i];
            }
       }

       return maior;

    }
}
