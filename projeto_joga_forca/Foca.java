package projeto_joga_forca;


import java.util.Scanner;



public class Foca {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String secretWord = "java".toUpperCase();

        char [] hideWord = new char[secretWord.length()];

        for (int i = 0; i < secretWord.length(); i++) {
            hideWord[i] = '_';
        }  

        int tryGuess = 6;
        

        
        while (tryGuess > 0) {
            
            System.out.println("Palavra: " + String.valueOf(hideWord));
            System.out.println("Tentativas restantes " + tryGuess);
            System.out.println("Digite a letra para brincar de forca");
            char letter = scanner.next().toUpperCase().charAt(0);

            boolean hit = false;
            
            for (int i = 0; i < hideWord.length; i++) {
                
                if(secretWord.charAt(i) == letter){
                    hideWord[i] = letter;
                    hit = true;
                }

            }

            if(!hit){
                tryGuess--;
                System.out.println("Essa letra nao existe na palavra");
            }else{
                System.out.println("Essa letra existe da palavra");
            }



            System.out.println(hideWord);

            if(String.valueOf(hideWord).equals(secretWord)){
                System.out.println("Voce Ganhou!");
                break;
            }else{
                System.out.println("Voce perdeu a palavra era :" + secretWord);
            }

           
        }
       
        scanner.close();

    }
}
