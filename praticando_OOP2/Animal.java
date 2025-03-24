package praticando_OOP2;

public class Animal {
    
    protected String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }

    void emitirSom(){
        System.out.println(nome + " esta emitindo som!");
    }
}
