package estruturas_repeticao;

public class LoopLabel {
    public static void main(String[] args) {
        

        externo:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if(i == 1 && j == 1){
                    break externo;
                }
                System.out.println("i" + i + ", j" + j);
            }
        }

    }
}
