package exercicios;
import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero e verificarei se o número é primo ou não");
        int numero = scanner.nextInt();

        String resultado  = ehPrimo(numero) ? "Primo" : "Nao eh um numero primo" ;
        
        System.out.println(resultado);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
