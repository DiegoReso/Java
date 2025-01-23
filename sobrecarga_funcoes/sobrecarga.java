package sobrecarga_funcoes;

public class sobrecarga {
    public static void main(String[] args) {
        System.out.println(soma(10,30));
        System.out.println(soma(13.0,2.0));
        System.out.println(soma(1, 2, 3));
    }

    public static int   soma(int a, int b){
        return a + b;
    }

    public static double soma(double a, double b){
        return a - b;
    }

    public static int soma(int a, int b, int c){
        return  a - b + c;
    }
}
