package leetcode;


import java.util.HashSet;
import java.util.Set;

public class ValidWord {
    public static void main(String[] args) {

        System.out.println(verify("abar34"));
    }

    public static boolean verify(String word){

        Set<Character> vowels = new HashSet<>(Set.of('A', 'E', 'I', 'O', 'U'));

        if(word.length() < 3){
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char c : word.toCharArray()){

            char charUpper = Character.toUpperCase(c);

            if(!Character.isLetterOrDigit(c)){
                return false;
            }

            if(Character.isLetter(c)){
                if(vowels.contains(charUpper)){
                    hasVowel = true;
                }else{
                    hasConsonant = true;
                }
            }
        }
        return hasConsonant && hasVowel;

    }
}
