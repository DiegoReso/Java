package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(verify("III"));

    }

    static int verify(String s) {
        int total = 0;
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);


        for (int i = 0; i <= s.toCharArray().length -2; i++) {

            int currentValue = romanValues.get(s.charAt(i));
            int nextValue = romanValues.get(s.charAt(i +1));

            if(currentValue < nextValue){
                total -= currentValue;
            }else{
                total += currentValue;
            }

        }
        total += romanValues.get(s.charAt(s.length() -1));
        return total;
    }
}

