package lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class lambda {
    public static void main(String[] args) {
        
        Runnable tarefa = () -> System.out.println("Minha funcao anonima");

        tarefa.run();

        List<String> nomes = Arrays.asList("Ana","Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));
        
    

    }

}
