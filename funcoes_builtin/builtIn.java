package funcoes_builtin;

import exercicios.exe1;

public class builtIn {
    public static void main(String[] args) {
        
        String name = "Diego Reis";
        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.substring(0,5));

        System.out.println(name.replace("e","o"));


        int number = 81;

        System.out.println(Math.sqrt(number));
        System.out.println(Math.pow(number, 2));
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(number, 100));


    }
}
