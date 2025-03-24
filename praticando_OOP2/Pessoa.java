package praticando_OOP2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //nao eh boa pratica realizar sobreescrita de metodos do java
    @Override
    public String toString(){
        return "Nome: " + nome + ", idade: " + idade;
    }
}
