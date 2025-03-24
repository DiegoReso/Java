package praticando_OOP2;

public class PessoaEndereco {
    private String nome;
    private int idade;
    private Endereco endereco;

    public PessoaEndereco(String nome, int idade, Endereco endereco ){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    void exibirDetalhePessoaEndereco(){
        System.out.println("Pessoa de nome: " + nome + " e idade: " + idade );
        endereco.exibirEndereco();
    }
}
