package praticando_OOP2;

public class Motor {
    
    private String nome;
    private String modelo;
    private int anoFabricarao;
    private int potencia;

    public Motor(String nome, String modelo, int anoFabricacao, int potencia){
        this.nome = nome;
        this.modelo = modelo;
        this.anoFabricarao = anoFabricacao;
        this.potencia = potencia;
    }

    void getInfo(){
        System.out.println("Motor de nome: " + nome + ", modelo : " + modelo + ", ano de fabricacao " + anoFabricarao + " e potencia: " + potencia);
    }
}
