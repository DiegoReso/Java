package projeto_tabuada;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Entre com o numero para a tabuada");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i) );
        }

        scanner.close();
    }
}
