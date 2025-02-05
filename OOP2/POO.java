package OOP2;

public class POO {
    public static void main(String[] args) {
      
        //1- object composition

        Motor motor1 = new Motor("V8", 450);
        

        Carro carro1 = new Carro("Ford","Mustang", motor1);
        carro1.exibirInfo();
        
        //heranca

        Cachorro hanna = new Cachorro("Hanna Bakers");
        hanna.latir();
        hanna.emitirSom();

        //classe object

        Pessoa diego = new Pessoa("Diego", 34);
        Pessoa jao = new Pessoa("Jao", 18);
        System.out.println(diego.toString());
        System.out.println(diego.hashCode());

    }
}
