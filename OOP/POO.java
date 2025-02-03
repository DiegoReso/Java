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

        //Exericio 1

        Celular iphone = new Celular();
        iphone.marca = "apple";
        iphone.modelo = "iphone 14 pro max";

        iphone.ligar();
        iphone.desligar();
        iphone.usarCelular(30);;

        //Exercicio 2

        Aluno aluno1 = new Aluno("Diego", 1, 50);
        System.out.println("O nome do aluno1 eh " + aluno1.getName());
        

        System.out.println("O nome do aluno1 eh " + aluno1.getName());

        Aluno aluno2 = new Aluno("Taiwane", 2, 0);

        System.out.println("O nome do aluno2 eh " + aluno2.getName());

        aluno1.getInformation();
        aluno2.getInformation();
        
        //exercicio 3

        ContaCorrente contaDiego = new ContaCorrente();
        contaDiego.deposit(5000);
        contaDiego.setWithDrawalLimit(500);
        contaDiego.withDrawal(600);

        System.out.println("Sua conta possui " + contaDiego.getBalance() + " de saldo");
        
        //exercicio 4

        ProdutoEletronico eletronico = new ProdutoEletronico("Geladeira", 1500, true);

        eletronico.applyDiscount(10);
        eletronico.getInformation();

        //exercicio 5

        LivroBiblioteca livro1 = new LivroBiblioteca();

        livro1.setTitle("Charlotte's web");
        livro1.setWriter("E.B White");
        livro1.setAvailable(false);

        livro1.borrowBook();
        livro1.returnBook();
        livro1.borrowBook();
        livro1.borrowBook();

        //Classe imutavel


        ClasseImutavel imutavel = new ClasseImutavel("Diego", 34);
        imutavel.getName();
        imutavel.getAge();
    }       

    
}
