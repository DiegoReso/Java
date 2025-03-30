package serializando;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir") + "\\serializando\\";
        System.out.println(currentDir);

        Pessoa pessoa = new Pessoa("Diego", 34);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        
        try(ObjectOutputStream objetoSerializado = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar o arquivo");
        }
    }
}
