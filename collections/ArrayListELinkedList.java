package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListELinkedList {
    public static void main(String[] args) {
        //List mais rapido apra leitura
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Diego");
        listaDeNomes.add("Cailania");
        listaDeNomes.add("Roskana");

        //resgatar
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        //alterar
        listaDeNomes.set(1, "Cailania Reis");
        System.out.println("Segundo nome: " + listaDeNomes.get(1));

        //remover elemento
        listaDeNomes.remove(2);
        System.out.println(listaDeNomes);

        //procura por valor de item
        //retorna true ou false
        System.out.println(listaDeNomes.contains("Diego"));

        //adicionando objeto na arraylist
        ArrayList<Pessoa> pessoa = new ArrayList<>();

        pessoa.add(new Pessoa(1,"Diego", 35, "niteroi - rj", "desenvolvedor"));
        pessoa.add(new Pessoa(2,"Cailania Reis", 31, "niteroi - rj", "Engenheira das Brabas"));
        pessoa.add(new Pessoa(3,"Roskana Costa", 32, "VR City", "Contadora"));

        //procurando uma pessoa por ID
        int idProcurado = 1;

        System.out.println("Procurando pessoa com ID " + idProcurado + ":");

        for (Pessoa p : pessoa) {
            if(p.getId() == idProcurado){
                System.out.println("Pessoa foi identicada!");
                System.out.println("Nome: " + p.getNome() + ", idade " + p.getIdade() + ", cidade " + p.getCidade() + " e sua funcao eh "+ p.getFuncao());
            }
        }

        for (Pessoa p : pessoa) {
            if(p.getId() == 1){
                p.setFuncao("Cuidador de Onca");
                System.out.println("A funcao da pessoa " + p.getNome() + " foi alterado!" );
                System.out.println("Nova funcao: " + p.getFuncao());
            }
        }

        //lista das pessoas atualizados
        System.out.println("\nLista das pessoas atualizadas");
        pessoa.forEach(p -> System.out.println("Nome: " + p.getNome() + ", idade " + p.getIdade() + ", cidade " + p.getCidade() + " e sua funcao eh "+ p.getFuncao()));

        //LinkedList mais rapido para insercao e edicao
        List<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(18);

        numeros.set(1, 6);

        System.out.println(numeros);
    }
}
