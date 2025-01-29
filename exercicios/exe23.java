package exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class exe23 {
    public static void main(String[] args) {
        
        int [] numeros = {1,1,2,2,3,4,5};

        ArrayList<Integer> numerosSemDuplicados = new ArrayList<>();

        for (int numero : numeros) {
            
            if(!numerosSemDuplicados.contains(numero)){
                numerosSemDuplicados.add(numero);
                
                System.out.println(numerosSemDuplicados);
            }
        }

    }
}
