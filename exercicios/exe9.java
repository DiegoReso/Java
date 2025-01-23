package exercicios;

public class exe9 {
    public static void main(String[] args) {

        double temp = conversorTemperatura(13);
        System.out.println(temp);
        
    }

    public static double conversorTemperatura(double celsius){
        return (celsius * 9/5) + 32;
    }
}
