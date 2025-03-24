package praticando_OOP2;

public class Main {
    public static void main(String[] args) {
        System.out.println("//Object composition//");

        Motor motor1 = new Motor("Motor volks", "1.0 boost", 1999, 5);

        Carro volks = new Carro("Volks", "Voyage", motor1);
        volks.getInfo();

        System.out.println("//Heranca//");
        Cachorro hanna = new Cachorro("Hanna Bakers");
        hanna.emitirSom();
        hanna.latir();

        System.out.println("//Object Class//");
        Pessoa diego =  new Pessoa("Diego", 34);
        Pessoa cailania =  new Pessoa("cailania", 31);
        System.out.println(diego.hashCode());
        System.out.println(diego.toString());
        System.out.println(diego.equals(cailania));
    }
}
