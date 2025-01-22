package exercicios;
import java.util.Scanner;


public class exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero a ser verificado");
        int number = scanner.nextInt();

        if(number >= 10 && number <=20){
            System.out.println("Dentro do intervalo");
        }else{
            System.out.println("Fora do intervalo");
        }

        scanner.close();
    }
}
