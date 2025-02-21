package OOP_EXE;

public class Hidroaviao extends Barco implements Pilotavel{
    
    @Override
    public void pilotar(){
        System.out.println("Estamos pilotando o hidroaviao e depois ira navegar");
    }

}
