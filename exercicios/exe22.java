package exercicios;


public class exe22 {
    public static void main(String[] args) {
        
        int [] numeros = {-1,2,3,4,-9};

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0){
                numeros[i] = 0;
            }
        }

        for (int i : numeros) {
            System.out.println(i);
        }

    }
}
