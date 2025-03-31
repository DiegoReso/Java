package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        ObjetoGenerico<Integer> objetoInteger = new ObjetoGenerico<>();
        objetoInteger.adicionar(10);

        System.out.println("Numero adicionado no objeto Integer "+ objetoInteger.obter());

        ObjetoGenerico<String> objetoString = new ObjetoGenerico<>();
        objetoString.adicionar("Dieguito");
        System.out.println("String adicionado ao objeto String "+objetoString.obter());

        System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10));

        System.out.println("Maior valor entre Java e Python: " + obterMaior("Java", "Python"));

        Integer[] arrayNumerico = {1,2,3,4};
        imprimirArray(arrayNumerico);

        String[] arrayString = {"Diego", "Cailania", "Roskana"};
        imprimirArray(arrayString);

        Boolean[] arrayBoolean = {true,false,true,true};
        imprimirArray(arrayBoolean);
        System.out.println("");

        Comparador<Integer> compararInteiros = new Comparador<>();
        System.out.println("Maior numero inteiro eh: "+compararInteiros.obterMaior(10, 30));

        Comparador<Double> compararDouble = new Comparador<>();
        System.out.println("Maior numero double eh: " + compararDouble.obterMaior(1.55, 4.55));

        Comparador<Float> compararFloat = new Comparador<>();
        System.out.println("Maior numero float eh: " + compararFloat.obterMaior(654654654654654F, 32132165465465321F));

        //erro de compilacao
        //bound mismatch pois delimitamos apenas para numeros da classe Number
        //Comparador<String> comparadorString = new Comparador<>();


        //Wildcard com qualquer tipo de lista
        List<Integer> listaInteiros = List.of(1,2,3,4,56,6,7);

        List<String> listaString = List.of("Diego", "Cailane", "Roskany");

        imprimirLista(listaString);
        imprimirLista(listaInteiros);
            
        System.out.println("Wildcard com lista de numeros");
        //Wildcard apenas com lista de numeros
        List<Integer> listaNumerosInteiros = List.of(1,2);
        System.out.println(somarNumeros(listaNumerosInteiros));
        

        //Wildcard aceitando apenas tipo numericos especificos
        System.out.println("Wildcard aceitando apenas inteiros");
        List<Integer> listaNumerosSomenteInteiros = new ArrayList<>();
        adicionarNumeros(listaNumerosSomenteInteiros);
        
        for (Integer integer : listaNumerosSomenteInteiros) {
            System.out.println(integer);
        }
    }

    public static  <T extends Comparable <T>> T obterMaior(T valor1, T valor2){
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array){
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
    }

    public static void imprimirLista(List<?> lista){
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista){
        double soma = 0;

        for (Number number : lista) {
            soma += number.doubleValue();
        }

        return soma;
    }

    public static void adicionarNumeros(List<? super Integer> lista){

        for (int i = 1; i < 5; i++) {
            lista.add(i);
        }
    }
}
