package OOP;

public class POO {
    public static void main(String[] args) {
        //1 - Criar classe
        //Criacao de carro.java

        //2 - Instanciar a classe
        Carro gol = new Carro();
        gol.marca = "Volks";
        gol.ano = 1996;
        gol.modelo = "gol bola";

        gol.acelerar();
        gol.exibirInfo();

        Carro fusca = new Carro();
        fusca.marca = "VW";
        fusca.ano= 1980;
        fusca.modelo = "fusca";
        fusca.motorLigado = false;
        
        fusca.aumentarVelocidade(20);
        fusca.ligarMotor();

        fusca.exibirInfo();
        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(80);

    }
    

}
