package OOP2;

public class Pessoa {
    private String name;
    private int idade;

    public Pessoa(String name, int idade){

        this.name = name;
        this.idade = idade;

    }

    //overrride
    @Override
    public String toString(){
        return "Nome: " + name + " idade : " + idade;
    }

}
