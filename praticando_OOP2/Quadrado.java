package praticando_OOP2;

public class Quadrado extends FormaGeometrica {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado,2);
    }
}
