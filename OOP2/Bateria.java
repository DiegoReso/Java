package OOP2;

public class Bateria extends InstrumentoMusical{
    
    public Bateria(String nome){
        super(nome);
    }

    @Override
    public void tocar(){
        System.out.println("Batendo baqueta na " + nome);
    }
    
}
