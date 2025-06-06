package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String art = "aa";
        String rat = "bb";

        System.out.println(isAnagram(art,rat));

    }

    public static boolean isAnagram(String s, String t){

        Map<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) +1);
        }

        for(char c : t.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) -1);
        }

        for(int val : count.values()){
            if(val != 0){
                return false;
            }
        }

        return true;
    }

}

