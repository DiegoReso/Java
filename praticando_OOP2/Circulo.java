package praticando_OOP2;

public class Circulo extends FormaGeometrica {
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    double calcularArea(){
        System.out.println("Calculando Raio");
        return Math.PI * Math.pow(raio, 2);
    }
}
