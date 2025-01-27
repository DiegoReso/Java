package estruturas_repeticao;

public class While {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5,6};
        int i = 0;

        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }


        //cuidado com loop infinito - exemplo
        // while (true) {
        //     System.out.println("Looping infinito");
        // }
    }
}
