package OOP2;

public class Iphone {

    private String name;
    private String model;
    private int ram;
    private Processador processador;

    public Iphone(String name, String model, int ram, Processador processador){
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.processador = processador;
    }


    public void getDetailsPhone(){
        System.out.println("Iphone " + this.name + " modelo: " + this.model + " com " + this.ram + " de memoria RAM !");
        processador.getDetails();;
    }
}
