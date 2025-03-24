package praticando_OOP2;

public class Bateria extends InstrumentoMusical {
    
    public Bateria(String nome){
        super(nome);
    }

    void tocar(){
        System.out.println("Estou tocando bateria: " + nome);
    }


}   
