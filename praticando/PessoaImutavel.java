public class PessoaImutavel {
    

    private final String nome;
    private final int idade;

    public PessoaImutavel(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void getNome(){
        System.out.println("Nome da classe imutavel: " + nome);
    }

    void getIdade(){
        System.out.println("Idade da classe imutavel: " + idade);
    }
}
