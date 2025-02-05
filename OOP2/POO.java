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
        System.out.println(diego.toString());
        System.out.println(diego.hashCode());



        //heranca com overriding e superclasse
        Funcionario taiwane = new Funcionario("Taiwane", 1500);
        taiwane.exibirDetalhes();
        System.out.println("O calculo de bonus foi: " + taiwane.calcularBonus());

        Gerente gerente = new Gerente("Diego", 1500, 1000);
        gerente.exibirDetalhes();
        System.out.println("O calculo de bonus foi: " + gerente.calcularBonus());
        
        //classe abstrata

        InstrumentoMusical violao = new Violao("Violao");
        InstrumentoMusical bateria = new Bateria("Bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();

        violao.tocar();
        bateria.tocar();


    }
}
