package OOP_EXE;

public class Main {
    public static void main(String[] args) {
        //exercicio1
        Endereco end1 = new Endereco("travessa dona", 20, "Volta Redonda");
        Pessoa diego = new Pessoa("Diego Reis", 34, end1);
        diego.exibirDetalhes();


        //exercicio2
        Carro carro = new Carro();
        carro.acelerar();

        Moto moto = new Moto();
        moto.acelerar();

        //exercicio3
        Cachorro cachorro = new Cachorro("Cachorro", "Latindo", "Vira Lata");
        cachorro.exibirDetalhe();
    }
}
