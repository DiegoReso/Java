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

        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            
            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");

        } catch (Exception e) {
            
            System.out.println("Erro ao escrever em arquivo " + e.getMessage());

        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            
            writer.write("Escrevendo com BufferedWriter");
            writer.newLine();
            writer.write("EScrevendo linha 2");
            writer.newLine();
            writer.append("Testando append");
            
        } catch (Exception e) {
            System.out.println("Nao foi possivel escrever no arquivo bom BufferedWriter");
        }
    }
}
