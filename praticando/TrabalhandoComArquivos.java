import java.io.BufferedReader;
import java.io.FileReader;


public class TrabalhandoComArquivos {
    public static void main(String[] args) {

        //excecao verificada
        try {
           BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
           String linha = reader.readLine();  
           System.out.println(linha);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
        String texto = null;
        System.out.println(texto.length());


    }
}
