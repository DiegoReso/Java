package estruturas_repeticao;

public class Break {
    public static void main(String[] args) {
        

        for (int i = 0; i <=10; i++) {
            System.out.println("O valor de i eh: " + i);

            if (i == 7) {
                System.out.println("Parando Loop pois ele eh igual a: " + i);
                break;
            }
        }

    }
}
