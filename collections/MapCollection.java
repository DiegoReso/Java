package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
    public static void main(String[] args) {
        
        //Hashmap
        Map<String, Integer> idadeMap = new HashMap<>();
        idadeMap.put("Diego", 35);
        idadeMap.put("Cailania", 31);
        idadeMap.put("Roscana", 33);

        System.out.println(idadeMap);

        System.out.println("Idade de Cailania: " + idadeMap.get("Cailania"));

        //exibe key e exibe valor
        System.out.println(idadeMap.containsKey("Diego"));
        System.out.println(idadeMap.containsValue(31));
        
        idadeMap.remove("Diego");
        System.out.println(idadeMap);

        //exibe valores
        System.out.println(idadeMap.entrySet());

        //LinkedHashMap
        Map<String,String> capitalMap = new LinkedHashMap<>();
        capitalMap.put("RJ", "Rio de janeiro");
        capitalMap.put("SP", "Sao Paulo");
        capitalMap.put("BH", "Minas Gerais");

        System.out.println(capitalMap);

        //TreeMap
        Map<String, Double> produtoPrecoMap = new TreeMap<>();
        produtoPrecoMap.put("Maca", 35.5);
        produtoPrecoMap.put("Banana", 2.99);
        produtoPrecoMap.put("Abacate", 354.0);

        System.out.println(produtoPrecoMap);

    }
}
