public class Cachorro extends Animal{

    
    public Cachorro(String name, int age){
        super(name,age);
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som do cachorro chamado " + this.getName());
    }

}
