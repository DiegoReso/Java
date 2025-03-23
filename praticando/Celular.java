public class Celular {
    private String marca;
    private String modelo;
    private int bateria;

    public Celular(String marca, String modelo, int bateria){
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void getInfo(){
        System.out.println("O celular de marca " + marca + " de modelo " + modelo + " esta com bateria em " + bateria + "%");
    }

    public void ligarCelular(){
        System.out.println("Celular foi ligado");
    }

    public void desligarCelular(){
        System.out.println("Celular esta sendo desligado");
    }

    public void consumoBateria(int consumo){
        this.bateria -= consumo;
        System.out.println("A bateria esta sendo consumida e no mometo esta em " + bateria + "%");
    }
}
