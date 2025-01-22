package exercicios;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o dia da semana");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Domingo nao eh um dia util");
                break;
                case 2:
                System.out.println("Segunda eh um dia util");
                break;
                case 3:
                System.out.println("Terca eh um dia util");
                break;
                case 4:
                System.out.println("Quarta eh um dia util");
                break;
                case 5:
                System.out.println("Quinta eh um dia util");
                break;
                case 6:
                System.out.println("Sexta eh um dia util");
                break;
                case 7:
                System.out.println("Sabado nao eh um dia util");
                break;
            default:
                break;
        }

        scanner.close();
    }
}
