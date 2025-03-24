package praticando_OOP2;

public class Guitarra extends InstrumentoMusical{
    public Guitarra(String nome){
        super(nome);
    }

    void tocar(){
        System.out.println("Estou tocando guitarra: " + nome);
    }
}
