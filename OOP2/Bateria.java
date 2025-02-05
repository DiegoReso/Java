package OOP2;

public class Bateria extends InstrumentoMusical {
    
    public Bateria(String nome){
        super(nome);
    }

    public void tocar(){
        System.out.println("Tocando bateria");
    }
}
