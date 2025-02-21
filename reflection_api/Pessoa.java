package reflection_api;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void dizerOla(){
        System.out.println("Ola a todos! meu nome eh: " + this.nome + " e tenho " + this.idade + " de idade!");
    }
}
