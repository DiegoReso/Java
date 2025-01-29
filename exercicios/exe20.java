package exercicios;

import java.util.Arrays;

public class exe20 {
    public static void main(String[] args) {
        
        int[] arrayInteiros = {1,2,2,3,4,4,4,5,5,6,6,6,6,6};

        int maisFrequente = arrayInteiros[0];

        int maxContagem = 1;
        

        for (int i = 0; i < arrayInteiros.length; i++) {

            int contagem = 0;

            System.out.println("Looping externo: " + arrayInteiros[i]);
            for (int j = 0; j < arrayInteiros.length; j++) {

                
                System.out.println("Loop interno: " + arrayInteiros[j]);
                
                if(arrayInteiros[j] == arrayInteiros[i]){
                    contagem++;
                }
                
                System.out.println(contagem);
                
                if(contagem > maxContagem){
                    maxContagem = contagem;
                    maisFrequente = arrayInteiros[i];
                }
            }
        }
       System.out.println("O item mais frequente eh :" + maisFrequente);
    }
}
