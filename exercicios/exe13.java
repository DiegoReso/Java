package exercicios;

public class exe13 {
    public static void main(String[] args) {

        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            System.out.println("A soma de "+ soma + " + " + i + " eh: " + (soma + i)); 
            soma += i;
        }
        
        System.out.println(" A soma de todos os numeros de 1 a 100: " + soma);
    }
}
