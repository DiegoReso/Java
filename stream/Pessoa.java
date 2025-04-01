package stream;

public class Pessoa {
    
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    String getNome(){
        return nome;
    }

    Integer getIdade(){
        return idade;
    }

    @Override
    public String toString(){
        return nome + " - " + idade + " anos.";
    }
}
