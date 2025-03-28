public class MainExcecoes {
    public static void main(String[] args) {
        
        try {

        int a = 0;
        int b = 2;

        int resultado = b / a;
        System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero " + e.getMessage());
        }

        System.out.println("fora do try catch");

        try{
            int[] numeros = {1,2,3,4,5};
            
            System.out.println(numeros[4]);
        }catch(Exception e){
            System.out.println("Erro de impressao do array, MSG: " + e.getMessage());
        }finally{
            System.out.println("Executou o finally");
        }
        
        try{
            validarIdade(10);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        
    }

    public static void validarIdade(int idade){

        if(idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior que 18");
        }

        System.out.println("Idade valida: " + idade);
    }
}
