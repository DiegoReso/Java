package OOP;

public class POO {
    public static void main(String[] args) {
        //1 - Criar classe
        //Criacao de carro.java

        //2 - Instanciar a classe
        Carro gol = new Carro();
        gol.marca = "Volks";
        gol.ano = 1996;
        gol.modelo = "gol bola";

        gol.acelerar();
        gol.exibirInfo();

        Carro fusca = new Carro();
        fusca.marca = "VW";
        fusca.ano= 1980;
        fusca.modelo = "fusca";
        fusca.motorLigado = false;

        fusca.marca = "VolksWagen";
        
        fusca.aumentarVelocidade(20);
        fusca.ligarMotor();

        fusca.exibirInfo();
        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(80);
         
        //trabalhando com get e set

        Pessoa diego = new Pessoa();

        diego.setName("Diego Reis");
        diego.setAge(34);

        System.out.println("O nome eh " + diego.getName());
        System.out.println("E sua idade eh " + diego.getAge());


        ContaBancaria contaDoDiego = new ContaBancaria();

        contaDoDiego.setTitular("Diego");
        contaDoDiego.setSaldo(1500);
        System.out.println("O nome do titular eh: " + contaDoDiego.getTitular() + " Seu saldo eh: " + contaDoDiego.getSaldo());


        Produto produto = new Produto();
        produto.setNome("Camiseta XX");
        produto.setPreco(50);
        System.out.println(produto.getName());
        System.out.println(produto.getPreco());
        
        produto.aplicarDesconto(10);
        
        //contructor
        Livro livroTeste = new Livro("Titulo teste", "Diego Reis", 40);
        livroTeste.exibirInfo();


    }
    
}
