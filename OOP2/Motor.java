package OOP2;

public class Motor {
    
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void exibirInfo(){
        System.out.println("Motor tipo: " + this.tipo + " e a potencia : " + this.potencia );
    }

}
