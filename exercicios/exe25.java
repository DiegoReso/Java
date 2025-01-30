package exercicios;

import java.util.Arrays;

public class exe25 {
    public static void main(String[] args) {
        
        
        int[] numerosCorretos = {5,4,3,2,1};
        
        inverterArray(numerosCorretos);

        for (int i : numerosCorretos) {
            System.out.println(i);
        }
    }
    
    public static void inverterArray(int[] numeros){

        int inicio = 0;
        int fim = numeros.length -1;


        while(inicio < fim){
            int temp =  numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println();
    }
}
