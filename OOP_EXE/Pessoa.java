package OOP_EXE;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }


    public void exibirDetalhes(){
        System.out.println("O nome da pessoa eh: " + this.nome + " e sua idade eh: " + this.idade);
        endereco.exibirEndereco();
    }

}
