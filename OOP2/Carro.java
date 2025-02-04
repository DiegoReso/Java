package OOP2;

public class Carro {
    
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirInfo(){
        System.out.println("Carro da marca " + this.marca + " modelo " + this.modelo);
        motor.exibirInfo();
    }
}
