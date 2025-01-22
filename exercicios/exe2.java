package exercicios;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        
        System.out.println("Entre com o preco do produto");
        Scanner scanner = new Scanner(System.in);
        int preco = scanner.nextInt();

        if(preco < 50){ 
            System.out.println("Produto com valor " + preco + " eh considerado um produto barato");
        }else if(preco >= 50 && preco <= 100){
            System.out.println("Produto com valor " + preco + " eh considerado um produto medio");
        }else{
            System.out.println("Produto com valor " + preco + " eh considerado um produto Caro");
        }

        scanner.close();
    }
}
