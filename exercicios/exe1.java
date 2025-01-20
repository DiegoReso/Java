package exercicios;

public class exe1 {
    public static void main(String[] args) {
        int numeroDez = 10;
        int numero2x = numeroDez * 2 ;
        System.out.println(numero2x);

        char letra = 'B';
        int valorAscii = (int) letra;
        System.out.println(valorAscii);

        double num1 = 15.75;
        double num2 = 20.40;
        double somaDouble = num1 + num2;
        System.out.println(somaDouble);

        long doisBilhoes = 2_000_000_000L;
        int doisBilhoesInt = (int) doisBilhoes;
        System.out.println(doisBilhoesInt);


        String ola = "Ola Mundo!";
        String java = "Bem-vindo ao Java";
        System.out.println(ola + " " + java);

    }
}
