package exercicios;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu login: ");
        String user = scanner.nextLine();

        System.out.println("Entre com a senha: ");
        String password = scanner.nextLine();

        if(user.equals("admin") && password.equals("1234")){
            System.out.println("Usuario logado com sucesso");
        }else{
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}
