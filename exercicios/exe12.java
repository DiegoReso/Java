package exercicios;

public class exe12 {
    public static void main(String[] args) {

        int[] numeros = {1,3,4,44};
        encontrarMaiorNumero(numeros);
    

    }

    public static void encontrarMaiorNumero(int[] numeros){

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > maior){
                maior = numeros[i];
            }

        }
        System.out.println("O maior numero eh " + maior);
    }
}
