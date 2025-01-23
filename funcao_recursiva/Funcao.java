package funcao_recursiva;

public class Funcao {
    public static void main(String[] args) {
           
        System.out.println(somaRecursiva(6));

    }
    
    public static int somaRecursiva(int n){
        
        if(n == 1){
            return 1;
        }else{
           return n +  somaRecursiva(n - 1);
        }
    }


}
