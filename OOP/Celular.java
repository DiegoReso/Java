package OOP;

public class Celular {
    
    String marca;
    String modelo;
    int bateria = 10;

    void ligar(){
        System.out.println("O celular de marca "+ marca + " esta ligado!");
    }

    void desligar(){
        System.out.println("O celular de marca " + marca + " esta desligado");
    }

    void usarCelular(int consumo){
        if(bateria - consumo >=0){
            bateria = bateria - consumo;
            System.out.println("Bateria restante " + bateria);
        }else{
            System.out.println("Bateria insuficiente sua bateria atual eh " + bateria);
        }
    }
}
