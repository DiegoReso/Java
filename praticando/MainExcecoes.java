import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import bloco_try_catch.SaldoInsuficienteException;

public class MainExcecoes {
    public static void main(String[] args) {
        
        try {

        int a = 0;
        int b = 2;

        int resultado = b / a;
        System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero " + e.getMessage());
        }

        System.out.println("fora do try catch");

        try{
            int[] numeros = {1,2,3,4,5};
            
            System.out.println(numeros[4]);
        }catch(Exception e){
            System.out.println("Erro de impressao do array, MSG: " + e.getMessage());
        }finally{
            System.out.println("Executou o finally");
        }
        
        try{
            validarIdade(10);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        Banco minhaConta = new Banco(5000);

        try {
            minhaConta.sacar(6000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        

        try {
            processarArquivo("adasd");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            abrirArquivo(null);
        } catch (Exception e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa original: " + e.getCause());
        }

    }

    public static void validarIdade(int idade){

        if(idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior que 18");
        }

        System.out.println("Idade valida: " + idade);
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException{
        if(caminho == null || caminho.isEmpty()){
            throw new IOException("Caminho invalido");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()){
           throw new FileNotFoundException("Arquivo nao encontrado"); 
        }

        System.out.println("Arquivo encontrado com sucesso! :)");
    }

    public static void abrirArquivo(String caminho){

        try {
            if(caminho == null){
                throw new NullPointerException("Caminho nulo");
            }

            throw new FileNotFoundException("Arquivo nao encontrado");
        } catch (FileNotFoundException e) {
            
            NullPointerException npe = new NullPointerException("Erro ao processsar arquivo");
            npe.initCause(e);
            throw npe;
        }

    }
}
