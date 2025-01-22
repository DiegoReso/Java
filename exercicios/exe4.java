package exercicios;
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int number = scanner.nextInt();
        
        int modulo = number % 2;

        switch (modulo) {
            case 0:
                System.out.println("O numero eh par");
                break;
            case 1:
            System.out.println("O numero eh impar");    
            break;
            default:
                break;
        }
    }
}
