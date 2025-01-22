package condicionais;

public class Condicionais {
    public static void main(String[] args) {
        boolean isTrue = false;

        if(!isTrue){
            System.out.println("TRUE"); 
        }else{
            System.out.println("FALSE");
        }

        System.out.println(10 == 10);
        System.out.println(10 != 10);

        String name = "Diego";
        String lastName = new String("diego");

        System.out.println(name.equals(lastName));
        System.out.println(name.equalsIgnoreCase(lastName));

        int num = 10;

        if(num >= 5 && num <= 9){
            System.out.println("ENTROU IF");

        }else{
            System.out.println("ENTROU ELSE");
        }


        int idade = 19;
        boolean temCarteira = false;
        

        if(idade >= 18 ){
            System.out.println("Usuario pode tirar a carteira de motorista");
        }else{
            System.out.println("Usuario nao pode tirar a carteira de motorista");
        }


        if(idade > 18 & temCarteira ){
        System.out.println("Usuario permitido alugar o carro");
        }else{
            System.out.println("Usuario nao permitido alugar o carro");
        }

        if(idade > 18 || temCarteira){
            System.out.println("Usuario maior de 18 e tem carteira");
        }else{
            System.out.println("Usuario ou eh menor de 18 anos ou nao tem carteira");
        }

        switch (idade) {
            case 19:
                System.out.println(" A idade bateu na primeira opcao do switch");
                break;
            case 18:
                System.out.println("A idade bateu com a segunda opcao do swtich");
                break;
            default:
                System.out.println("A idade nao bateu com nenhuma opcao");
                break;
        }


        String nome = 1 + 1 == 2 ? "Diego" : "Taiwane"; 
        System.out.println(nome);
    }

}
