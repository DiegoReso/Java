package estruturas_repeticao;

public class Continue {
    public static void main(String[] args) {
        
        for (int i = 10; i > 0 ; i--) {

            if(i % 2 == 0){
                System.out.println("Numero par: " + i);
                continue;
            }

            System.out.println("Contador: " + i);

        }
    }
}
