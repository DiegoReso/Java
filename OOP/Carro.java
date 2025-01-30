package OOP;

public class Carro {

    //atributos ou propriedades
    String marca;
    String modelo;
    int ano;
    boolean motorLigado;
    double velocidadeAtual;

    void acelerar(){
        System.out.println("Estamos acelerando o carro!");
    }

    void exibirInfo(){
        System.out.println("Marca " + marca.toUpperCase() + ", modelo " + modelo.toUpperCase() + ", ano " + ano);
    }
    
    void ligarMotor(){
        if(!motorLigado){
            motorLigado= true;
            System.out.println("Ligando motor");
        }else{
            System.out.println("O motor ja esta ligado");
        }
    }

    void aumentarVelocidade(double incremento){
        if(motorLigado){
            velocidadeAtual += incremento;
            System.out.println("A velocidade atual eh: " + velocidadeAtual);
        }else{
            System.out.println("Voce precisa ligar o motor primeiro");
        }
    }
}
