package praticando_OOP2;

public class Carro {
    
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    void getInfo(){
        System.out.println("Marca do carro: " + marca + ", modelo: " + modelo);
        motor.getInfo();
        
    }
}
