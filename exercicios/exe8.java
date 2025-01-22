package exercicios;
import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Peso para o calculo IMC");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura para o calculo IMC");
        double altura =  scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Voce esta abaixo do pedo");
        }else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Voce esta no seu peso normal");
        }else if(imc >= 25 && imc <= 29.0){
            System.out.println("Voce esta com sobrepeso");
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Voce esta com Obesidade grau 1");
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("Voce esta com Obesidade grau 2");
        }else{
            System.out.println("Voce esta com obesidade grau 3");
        }

        scanner.close();

    }
}
