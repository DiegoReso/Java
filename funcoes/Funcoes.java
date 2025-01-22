package funcoes;

public class Funcoes {
    
    //escopo global
    static int globalVar = 15;

    public static void main(String[] args) {
        saudacao();
        soma(10,205);
        saudar("Diego");
        

        int number = 50;

        System.out.println(dobrar(10));
        System.out.println(dobrar(number));

        String r1 = verificarPar(number);
        String r2 = verificarPar(11);

        System.out.println(r1);
        System.out.println(r2);

        String r3  = verificarAcesso(18, true, false);
        System.out.println(r3);


        System.out.println(obterDiaDaSemana(1));

        verificarAutenticacao("admin", "SenhaSegura");
        System.out.println("texto para verificar funcionamento System.exit");

        //escopo local
        int localVar = 10;

        if(true){
            System.out.println("Local var é  visivel aqui e seu valor é: " + localVar);
        }

        acessaEscopoGlobal();
    }

    public static void saudacao(){
        System.out.println("Ola, esta eh minha primeira funcao");
    }

    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("A soma de " + a +  " + " + b +  " eh igual a : " + resultado);
    }

    public static void saudar(String nome){
        System.out.println("Ola, " + nome + ", tudo bem ?" );
    }

    public static int dobrar(int n){
        return n * 2;
    }

    public static String verificarPar(int n){
        if(n % 2 == 0){
            return "O numero " + n + " é par!";
        }else{
            return "O numero " + n + " não é par";
        }
    }

    public static String verificarAcesso(
        int idade,
        boolean temCarteira, 
        boolean temHistoricoNegativo){
            
            if(idade >= 18 && temCarteira && !temHistoricoNegativo){
                return "Acesso permitido: todos os criterios atendidos";
            }else{
                return " Aceso negado";
            }
    }  

    /**
     * Mostra dia da semana
     * @param dia dia da semana que precisa ser 1 para segunda e 7 para domingo
     * @return retorna o dia da semana
     */
    public static String obterDiaDaSemana(int dia){

        switch (dia) {
            case 1:
                return "Segunda-Feira";
            case 2:
                return "Terca-Feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";   
            case 6:
                return "Sabado"; 
            case 7:
                return "Domingo";
            default:
                return "Dia invalido";
        }
    }

    /**
     * Verifica acesso do usuario
     * @param usuario usuario que vira do banco de dados e precisa ser admin
     * @param senha usuario que vira do banco de dados e precisa ser SenhaSegura
     */

    public static void verificarAutenticacao(String usuario, String senha){
        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")){
            System.exit(1);
        }

        System.out.println("Autenticacao bem sucedida");
    }

    public static void acessaEscopoGlobal(){
        System.out.println(globalVar);
    }
}
