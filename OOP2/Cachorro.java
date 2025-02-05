package OOP2;

public class Cachorro extends Animal {
    
    public Cachorro(String name){
        super(name);
    } 
    
    public void latir(){
        System.out.println(name + " esta latindo");
    }
}
