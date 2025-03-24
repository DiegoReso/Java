public class Main{

    public static void main(String[] args) {
        

        //OOP basics
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

        Funcionario funcionario = new Funcionario("Cailania Reso", 8000, "654645");
        funcionario.exibirDados();
        //metodo proteced, pode ser aplicado nas classes e subclasses, por isso deixa ser usado aqui na main
        funcionario.aumentarSalario(20);

        //metodo nao aplicavel fora da propria classe
        //funcionario.verificarSenha(654545);

        //agora usamos um metodo publico que chama um metodo privado da classe
        funcionario.autenticar("65445");

        //Classe imutavel
        //uma vez declarada nao podemos alterar, nem dentro da propria classe
        PessoaImutavel pessoaImutavel = new PessoaImutavel("Diego Imutavel", 34);
        pessoaImutavel.getNome();
        pessoaImutavel.getIdade();

        //encapsulamento de arrays
        String[] alunosArray = {"Diego", "Cailanis","Roscana"};
        Turma turmaDaEscola = new Turma(alunosArray);

        for (String alunos : turmaDaEscola.getAlunos()) {
            System.out.println(alunos);
        }
        
        String[] novosAlunos = {"Jao", "Maria", "Lurdinha"};
        turmaDaEscola.setAlunos(novosAlunos);

        for (String novos : turmaDaEscola.getAlunos()) {
            System.out.println(novos);
        }
    }   

}