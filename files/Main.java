package files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        String currentDir = System.getProperty("user.dir") + "\\files\\";
         

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")){
            int caracter;
            System.out.println("***********Lendo com FileReader");
            while((caracter = reader.read()) != -1){
                System.out.print((char) caracter);
            }
            System.out.println("");
            System.out.println("***********");
        } catch (Exception e) {
            System.out.println("Erro ao ler um arquivo!");
        }

        
        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;
            System.out.println("***********Lendo com Buffered");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("***********");

        } catch (Exception e) {
            System.out.println("Nao foi possivel ler o arquivo!");
        }
    }
}
