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

        System.out.println("//Override//");
        Circulo circulo = new Circulo(3.2);
        System.out.println(circulo.calcularArea());

        Quadrado quadrado = new Quadrado(4);
        System.out.println(quadrado.calcularArea());

        System.out.println("//SUPER//");
        Gerente gerente = new Gerente("Gerente T.I", 10000, 1000);

        Funcionario carlos = new Funcionario("Carlos", 2500);
        System.out.println(carlos.calcularBonus());

        System.out.println(gerente.calcularBonus());
        gerente.getDetails();

        System.out.println("//ABSTRACAO//");
        InstrumentoMusical bateria = new Bateria("bateria pearl");
        InstrumentoMusical guitarra = new Guitarra("Guitarra");

        bateria.tocar();
        bateria.exibirDetalhes();

        guitarra.tocar();
        guitarra.exibirDetalhes();

        System.out.println("//INTERFACE//");
        Pagamento cartaoCredito = new CartaoCredito();
        cartaoCredito.processarPagamento(200);
        cartaoCredito.exibirRecibo(200);

        Pagamento transferenciaBancaria = new TransferenciaBancaria();
        transferenciaBancaria.processarPagamento(400);
        transferenciaBancaria.exibirRecibo(400);

        System.out.println("//MULTPLAS INTERFACES//");
        Documento doc = new Documento("DocPDF");
        doc.salvar();
        doc.imprimir();

        //Exercicio 1 - Object Composition
        Endereco end = new Endereco("Tv titia", 20, "RJ");
        PessoaEndereco pessoaEndereco = new PessoaEndereco("Cailania dos Reis Ferrelu", 31, end);

        pessoaEndereco.exibirDetalhePessoaEndereco();

        //Exercicio 2 - Inheritance 
        CarroVeiculo carroVeiculo = new CarroVeiculo("Fusca", 1295);
        System.out.println(carroVeiculo.acelerar());

        MotoVeiculo motoVeiculo = new MotoVeiculo("Fazer 250", 2014);
        System.out.println(motoVeiculo.acelerar());

        
    }
}
