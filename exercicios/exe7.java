package exercicios;
import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a letra a ser validada");
        String letra = scanner.nextLine();

        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Voce digitou uma vogal");
        }else{
            System.out.println("Voce digitou uma consoante");
        }
        
        scanner.close();
    }
}
