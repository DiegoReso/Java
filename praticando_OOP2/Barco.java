package praticando_OOP2;

public class Barco implements Navegavel {

    public void operarVeiculo(){
        System.out.println("Operando Barco");
    }

    @Override
    public void navegar(){
        System.out.println("Navegando com o barco");
    }
}
