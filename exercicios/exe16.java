package exercicios;

import java.util.Random;

public class exe16 {
    public static void main(String[] args) {
        
        
        int opcao;
     
        
        do {   
            System.out.println("Menu: ");
            System.out.println("0) Refrigerante");
            System.out.println("1) Hamburguer");
            System.out.println("2) Cachorro Quente");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");
            
            opcao = (int)(Math.random() * 5);   
            
            System.out.println("Opcao escolhida foi " + opcao);

        } while (opcao != 4);


    }
}
