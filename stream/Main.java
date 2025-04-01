package stream;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(10);
        numeros.add(12);
        numeros.add(90);
        numeros.add(320);

        System.out.println(numeros);

        List<Integer> numerosFiltrados = numeros.stream()
            .filter(numero -> numero >= 3)
            .collect(Collectors.toList());

        System.out.println(numerosFiltrados);

        //busca com for

        for (Integer numero : numerosFiltrados) {
            if(numero == 10){
                System.out.println("Numero 10 encontrado na lista");
            }
        }

        //busca com contains
        String encontrou  = numeros.contains(10) ? "Sim possui o 10" : "Nao possui o numero 10!";

        System.out.println(encontrou);

        //findAny
        Optional<Integer> qualquerNumero = numeros.stream().findAny();
        System.out.println(qualquerNumero);

        //findfirst

        Optional<Integer> primeiroNumero = numerosFiltrados.stream().findFirst();
        System.out.println(primeiroNumero);

        Optional<Integer> primeiroPar = numerosFiltrados
                .stream().filter(numero -> numero % 2 == 0).findFirst();

        System.out.println(primeiroPar);

        //aplicando map
        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(quadrados);
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Diego");
        nomes.add("Cailania");
        nomes.add("Roskana");

        List<String> nomesMaiusculos = nomes.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(nomes);
        System.out.println(nomesMaiusculos);

        //modificacao
        //adiciona
        numeros.add(89);
        System.out.println(numeros);
        //remove prlo indice
        numeros.remove(7);
        System.out.println(numeros);
        //remove pel0 valor
        numeros.remove(Integer.valueOf(3));
        System.out.println(numeros);
        //altera todo os elementos
        numeros.replaceAll(numero -> numero * 3);
        System.out.println(numeros);
        //removendo como se fosse um if
        numeros.removeIf(numero -> numero > 200);
        System.out.println(numeros);


        //reduce
        Integer soma = numeros.stream()
            .reduce(0, (acumulador, numero ) -> acumulador + numero);

        System.out.println(soma);
        
        String frase = nomes.stream()
            .reduce("", (acumulador, nome) -> nome + " " + acumulador);

        System.out.println(frase);

        //comparator
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Diego", 10));
        pessoas.add(new Pessoa("Oksana",7));
        pessoas.add(new Pessoa("Cailania", 8));

        System.out.println("\n*****Antes ordenacao********");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        //ordenacao pelo nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println("\n********Apos ordenacao*******");
        pessoas.forEach(pessoa -> System.out.println(pessoa));
        
        //ordenando por nome e idade
        System.out.println("\n********Ordenando Nome e idade*******");
        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                                .thenComparing(Pessoa::getIdade));
        pessoas.forEach(pessoa -> System.out.println(pessoa));
        
        //uso avancado de streams

        List<List<String>> listaDaListas = Arrays.asList(
            Arrays.asList("Maca","Morango"),
            Arrays.asList("Banana", "abacate"),
            Arrays.asList("Carro", "Mooto")
            );

        List<String> listaUnica = listaDaListas.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

        System.out.println("\n********Criando lista unica flatmap*******");
        System.out.println(listaUnica);
        
        //pipeline
        List<Integer> resultado = numeros.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 5)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("\n********Pipeline*******");
        System.out.println(resultado);
    }
}
