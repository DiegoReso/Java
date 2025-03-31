package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsImutaveis {
    public static void main(String[] args) {
        //criando lista mutavel

        List<String> listaMutavel = new ArrayList<>();
        listaMutavel.add("teste");
        listaMutavel.add("lista mutavel 123");


        //criando lista imutavel atraves de outra lista
        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);
        //criandoi lista imutavel .of
        List<String> listaImutavel2 = List.of("item1","item2", "item3");

        System.out.println(listaImutavel2);
        //nao deixa fazer a alteracao
        //listaImutavel2.add("item4");
    
        

    }
}
