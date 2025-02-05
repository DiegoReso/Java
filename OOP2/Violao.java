package OOP2;

public class Violao extends InstrumentoMusical {
    
    public Violao(String nome){
        super(nome);
    }

    public void tocar(){
        System.out.println("Tocando Violao");
    }
}
