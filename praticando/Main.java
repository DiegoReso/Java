public class Main{

    public static void main(String[] args) {
        
        Cachorro hanna = new Cachorro("Hanna", 8);
        hanna.emitirSom();

        Carro uno = new Carro();
        uno.acelerar();
        uno.name = "Fiat Uno";
        uno.marca = "Fiat";
        uno.anoFabricacao = 1965;
        System.out.println(uno.name);

        Pessoa joao = new Pessoa();
        joao.setNome("Jao");
        System.out.println("O nome da pessoa eh: " + joao.getNome());

        Livro livro = new Livro();
        livro.getInfo();

        Livro meuLivro = new Livro("Reri poter", "Diego Reis",20.22);   
        meuLivro.getInfo();

        Celular iphone16 = new Celular("Apple", "Iphone 16", 100);  
        iphone16.getInfo();
        iphone16.ligarCelular();  
        iphone16.desligarCelular();
        iphone16.consumoBateria(20);
        iphone16.getInfo();
        

        Aluno aluno = new Aluno("Diego", "d4343", 100);
        aluno.setNome("Diego Reis");
        aluno.getInfo();

        ProdutoEletronico tv = new ProdutoEletronico("Smart TV 65", 3000, true);
        
        tv.aplicarDesconto(0.2);
        tv.getInfo();

        LivroBiblioteca livroTeste = new LivroBiblioteca("Cronicas dos Kane", "Rick Riordan", true);
        livroTeste.setPegarEmprestadoLivro();
        livroTeste.getInfoLivro();

        livroTeste.setDevolverLivro();
        livroTeste.getInfoLivro();
        
        livroTeste.setDevolverLivro();
        livroTeste.getInfoLivro();

    }   

}