package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {

        //Hashset valores unicos e reordena os elementos
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("PHP");
        conjunto.add("PHP");

        System.out.println(conjunto.contains("Java"));

        System.out.println(conjunto);

        //LinkedSet valores ordenados na ordem cronologica de insercao

        Set<Integer> numeros = new LinkedHashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(4);
        
        System.out.println(numeros);
       

        //Treeset reordena elementos

        Set<String> nomes = new TreeSet<>();
        nomes.add("Diego");
        nomes.add("Allan");
        nomes.add("Cailani");

        System.out.println(nomes.contains("Diego"));

        
    }
}
