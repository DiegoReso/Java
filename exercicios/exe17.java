package exercicios;

public class exe17 {
    public static void main(String[] args) {
        
        int numero = 5;
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
         fatorial  *= i;
        }
        
        System.out.println("O fatorial de " + numero + " eh: " + fatorial );

        gerarFibonacci(10);
    }

    public static void gerarFibonacci(int n){

        int a = 0;
        int b = 1;
        System.out.println(a);
        for (int i = 1; i < n; i++) {
            System.out.println(b);
            int next = a + b;
            a = b;
            b = next;
        }


    }
}
