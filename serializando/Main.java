package serializando;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir") + "\\serializando\\";
        System.out.println(currentDir);

        Pessoa pessoa = new Pessoa("Diego", 34);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        
        try(ObjectOutputStream objetoSerializado = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
            objetoSerializado.writeObject(pessoa);
            System.out.println("Objeto Serializado com sucesso!");
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar o arquivo");
        }

        try (ObjectInputStream objetoDeserializado = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
            
            Pessoa pessoaDeserializada = (Pessoa) objetoDeserializado.readObject();

            System.out.println("Nome Deserializado: " + pessoaDeserializada.getNome() + " e idade: " + pessoaDeserializada.getIdade());

        } catch (Exception e) {
            System.out.println("Nao foi possivel deserializar o arquivo!");
        }
        
    }
}
