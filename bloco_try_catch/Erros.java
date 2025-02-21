package bloco_try_catch;
import java.io.*;

public class Erros {
    public static void main(String[] args) {
        
        try {
            int a = 0;
            int b = 10;
            int resultado = b/a;
        } catch (ArithmeticException e) {
            System.out.println("Divisao por 0 nao eh possivel.");
        }

        try {
            int[] numeros = {1,2,3};

            System.out.println(numeros[3]);
        } catch (Exception e) {
            System.out.println("Nao eh possivel acessar esse indice do array");

            System.out.println("Msg: " + e.getMessage());
        }


        try {
            int[] numeros = {1,2,3};

            System.out.println("Acessando o indice existente" + numeros[2]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nao eh possivel acessar esse indice do array usando finally");

            System.out.println("Msg: " + e.getMessage());
        }finally{
            System.out.println("Executou o finally");
        }

        //exececao com throw
        try {
            validarIdade(10);
        } catch (Exception e) {
            System.out.println("MSg: " + e.getMessage());
        }

        //execao customizada
        Banco bancoDiego =  new Banco(5000);
        
        try {
            bancoDiego.sacar(6000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Msg: " + e.getMessage());
        }

        //exception verificada

        try{
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        //exception nao verificada
        String texto = null;
        System.out.println(texto.length());


    }

    public static void validarIdade(int idade){

        if(idade < 18){
            throw new IllegalArgumentException("idade deve ser maior que 18");
        }

        System.out.println("idade valida: " + idade);
    }
}
