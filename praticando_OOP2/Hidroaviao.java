package praticando_OOP2;

public class Hidroaviao extends Barco implements Pilotavel{
    
    @Override
    public void operarVeiculo(){
        System.out.println("Operando hidroaviao");
    }

    @Override
    public void pilotar(){
        System.out.println("Pilotando o hidro aviao");
    }

    @Override
    public void navegar(){
        System.out.println("Navegando no hidro aviao");
    }
}
