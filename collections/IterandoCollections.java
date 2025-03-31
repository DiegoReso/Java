package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterandoCollections {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Diego");
        nomes.add("Cailania");
        nomes.add("Roskana");

        //foreach
        nomes.forEach(nome -> System.out.println(nome));


        System.out.println("**********ITERATOR***********");
        Iterator<String> nomesIterator = nomes.iterator();

        //remover um elemento
        while (nomesIterator.hasNext()) {
            String nome = nomesIterator.next();
            

            if(nome.equals("Roskana")){
                nomesIterator.remove();
            }
        }

        System.out.println(nomes);

        //List Iterator
        ListIterator<String> listIteratorNomes = nomes.listIterator();

        while (listIteratorNomes.hasNext()) {
            System.out.println("Nome: " + listIteratorNomes.next());
        }
    }
}
