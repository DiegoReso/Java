package OOP2;

public class Animal {

    protected String name;


    public Animal(String name){
        this.name = name;
    }

    public void emitirSom(){
        System.out.println(name + " esta emitindo som");
    }
}
