package OOP;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    
    private int[] chosenNumbers = new int[6];
    private int[] drawResult = new int[6];

    public Bilhete(int[] chosenNumbers){
        Arrays.sort(chosenNumbers);
        this.chosenNumbers = chosenNumbers;
    }
    
    public int[] setRandomNumbers(){
        Random random =  new Random();
        for (int i = 0; i < this.drawResult.length; i++) {
            this.drawResult[i] = random.nextInt(60) + 1;
        }
        Arrays.sort(this.drawResult);
        return Arrays.copyOf(this.drawResult, this.drawResult.length);
    }

    public int countHits(){
        int hits = 0;
        for (int i = 0; i < this.chosenNumbers.length; i++) {
            for (int j = 0; j < this.chosenNumbers.length; j++) {
                if(this.chosenNumbers[i] == this.drawResult[j]){
                    hits++;
                }
            }
        }
        System.out.println("O numeros escolhidos foram " + Arrays.toString(this.chosenNumbers));
        return hits;
    }

    public String getResult(){
        return "Voce acertou " + this.countHits() + " numeros no sorteio";
    }

}
