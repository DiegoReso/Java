package exercicios;

public class exe11 {
    public static void main(String[] args) {
        verificaIdade(15);
    }

    public static void verificaIdade(int idade){

        if(idade < 18){
            System.out.println("Acesso negado");
            System.exit(1);
        }

        System.out.println("Acesso permitido");

    }
}
