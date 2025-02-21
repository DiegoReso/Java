package OOP_EXE;

public class Barco implements Navegavel {

    public void navegandoEmAltoMar(){
        System.out.println("Estamos navegando em altomar com o barco");
    }

    @Override
    public void navegar(){
        System.out.println("Estamos navegando o barco");
    }
}
