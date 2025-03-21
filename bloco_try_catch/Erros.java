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
            validarIdade(25);
            validarIdade(10);
        } catch (Exception e) {
            System.out.println("MSg validar idade: " + e.getMessage());
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
        try {
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Texto esta nulo " + e.getMessage());
        }
    
        try {
            processarArquivo("/var/www/oi");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        //encadeamento de exececao
        try {
            abrirArquivos(null);
        } catch (Exception e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Mensagem encadeamento Exception causa: " + e.getCause());
        }

        //relancar excecoes
        try {
            processarDados(null);
        } catch (Exception e) {
            System.out.println("Outra coisa ...");

            System.out.println("Pilha de execucao " + e.getStackTrace());
        }

    }

    public static void validarIdade(int idade){

        if(idade < 18){
            throw new IllegalArgumentException("idade deve ser maior que 18");
        }

        System.out.println("idade valida: " + idade);
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {
        if(caminho == null || caminho.isEmpty()){
            throw new IOException("Caminho invalido");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()){
            throw new FileNotFoundException("Arquivo nao encontrado");
        }

        System.out.println("Arquivo encontrado com sucesso!");
    }

    //encadeamento de exececao
    public static void abrirArquivos(String caminho){
        try {

            if(caminho == null){
                throw new NullPointerException("Caminho nulo");
            }

            throw new FileNotFoundException("Arquivo nao encontrado encadeamento");
                
        } catch (FileNotFoundException e) {
            
            NullPointerException npe  = new NullPointerException("Erro ao processar arquivo");
            npe.initCause(e);

            throw npe;

        }
    }

    //relancar excecoes
    public static void processarDados(String dados) throws Exception{
        try {
            if(dados ==null){
                throw new NullPointerException("Os dados sao nulos");
            }
        } catch (Exception e) {
            System.out.println("Tratamento, criacao de log, ...");
            throw e;
        }
    }
}
