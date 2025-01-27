package projeto_conversor_temp;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Voce quer converter a temperatura para Celcius ou para Fahrenheit?  C para Celsius e F Para Fahrenheit!");

        String input = scanner.nextLine();
        char caractere = input.charAt(0);

        System.out.println("Entre com a temperatura a ser convertida");
        double temperatura = scanner.nextDouble();
        

        if(caractere == 'c'){
           double celsius = converterToCelsius(temperatura);
           System.out.println("A temperatura em celsius eh igual a :" + celsius + "C");
        }else if(caractere == 'f'){
            double fahrenheit = converterToFahrenheit(temperatura);
            System.out.println("A temperatura em Fahrenheit eh igual a: " + fahrenheit + "F");
        }else{
            System.out.println("Entre com C para Celsius ou F para Fahrenheit!");
        }

        
        scanner.close();
    }
    
    public static double converterToFahrenheit(double celsius){
        return celsius * 9/5 + 32;
    }

    public static double converterToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9 ;
    }


}
