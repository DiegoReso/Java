package listas;

public class Listas {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,30,4,5,6,7,8,9};

        int maior = numeros[8];
        int j = 0;

        while (j < numeros.length) {

            if(numeros[j] > maior){
                maior = numeros[j];
            }

            j++;
        }

        System.out.println("Maios numero eh " + maior);


        System.out.println(numeros[1]);

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println(soma);

        String [] frutas  = new String[3];
        frutas[0] = "maca";
        frutas[1] = "banana";
        frutas[2] = "pera";


        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
