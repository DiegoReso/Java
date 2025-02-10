package OOP2;

import javax.swing.text.Document;

public class POO {
    public static void main(String[] args) {
      
        //1- object composition

        Motor motor1 = new Motor("V8", 450);
        

        Carro carro1 = new Carro("Ford","Mustang", motor1);
        carro1.exibirInfo();

        Processador processadorIphoneA2 = new Processador("A2", 8, 6);

        Iphone iphone14 = new Iphone("Iphone 14", "ProMax", 256 , processadorIphoneA2);
        iphone14.getDetailsPhone();
        
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

        
        InstrumentoMusical violao = new Violao("violao");
        InstrumentoMusical bateria = new Bateria("bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();

        violao.tocar();
        bateria.tocar();

        //interfaces
        Pagamento cartao = new CartaoCredito();
        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        Pagamento transferencia = new TransferenciaBancaria();
        transferencia.processarPagamento(50);
        transferencia.exibirRecibo(50);


        //multiplas interfaces
        Documento trabalhoPdf = new Documento("trabalho PDF do Diego");
        trabalhoPdf.imprimir();
        trabalhoPdf.salvar();

        //metodo com default
        CalculadoraAvancada calc = new CalculadoraAvancada();
        System.out.println(calc.multiplicar(4,8)); 
        System.out.println(calc.somar(1, 5));

    }
}
