package exercicios;

import java.util.Arrays;

public class exe21 {
    public static void main(String[] args) {
        int[][] numeros = {
            {1,2,3},
            {4,5,6}
        };


        int [][] numerosTransposta = new int[numeros[0].length][numeros.length];
       

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("loop externo " + i);
            for (int j = 0; j < numeros[i].length; j++) {
                
                numerosTransposta[j][i] = numeros[i][j];
                System.out.println(numerosTransposta[i][j]);

            }
        }

        for (int[] is : numerosTransposta) {
               System.out.println(Arrays.toString(is)); 
        }
    } 
}
