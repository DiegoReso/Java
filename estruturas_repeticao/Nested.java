package estruturas_repeticao;

public class Nested {
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop externo! " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Loop interno! "+ j);
            }
        }

        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + j);
            }
            System.out.println();
        }
    }
}
