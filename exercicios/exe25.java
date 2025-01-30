package exercicios;

import java.util.Arrays;

public class exe25 {
    public static void main(String[] args) {
        
        
        int[] numerosCorretos = {5,4,3,2,1};
        
    
        
        System.out.println(Arrays.toString(inverterArray(numerosCorretos)));
    }
    
    public static int[] inverterArray(int[] numeros){

        int inicio = 0;
        int fim = numeros.length -1;
        int [] numerosCopy = new  int[numeros.length];

        while(inicio < fim){
            
            int temp =  numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;

            for (int i = 0; i < numerosCopy.length; i++) {
                numerosCopy[i] = numeros[i];
            }
            
            inicio++;
            fim--;
        }

        return numerosCopy;
    }
}
