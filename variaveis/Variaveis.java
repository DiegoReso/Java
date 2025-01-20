import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {

        String nome = "diego";
        System.out.println(nome);

        String firstName = "Diego";
        String lastName = "Reis";
        System.out.println(firstName + " " + lastName);

        char letra = 'A';
        System.out.println(letra);

        int numero = 42;
        System.out.println(numero);

        long populacaoMundial = 7800000000000L;
        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000_000L;
        System.out.println(grandeNumero);


        boolean isTrue = true;
        System.out.println(isTrue);

        float numeroFloat = 32.21333F;
        System.out.println(numeroFloat);

        double preco = 19.99;
        System.out.println(preco);


        int n1 = 50;

        long n1Long = n1;
        System.out.println(n1Long);

        double nDouble = n1;
        System.out.println(nDouble);

        double valorDouble = 9.78;

        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

    
        var z = 10;
        z = 15;
        System.out.println(z);

        //classe scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = scanner.nextLine();
        System.out.println("Ola " + name);


        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Sua idade eh " + idade);
        scanner.nextLine();

        System.out.println("Digite o nome de sua amada");
        String nameLove = scanner.nextLine();
        System.out.println("O nome dela eh " + nameLove + " e a idade eh " + idade);

        scanner.close();
        //teste comentario
        /*
         * comentando o codigo
         * teste comentario em bloco
         */


    }
}
