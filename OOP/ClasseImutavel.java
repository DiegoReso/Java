package OOP;

public class ClasseImutavel {
    
    private final String name;
    private final int age;

    public ClasseImutavel(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void getName(){
        System.out.println(this.name);
    }

    public void getAge(){
        System.out.println(this.age);
    }

    //nao podemos ter setters, pois, a classe eh imutavel
}
