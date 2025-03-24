package praticando_OOP2;

public class Main {
    public static void main(String[] args) {
        //object composition

        Motor motor1 = new Motor("Motor volks", "1.0 boost", 1999, 5);

        Carro volks = new Carro("Volks", "Voyage", motor1);
        volks.getInfo();
    }
}
