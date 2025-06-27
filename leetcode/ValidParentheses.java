package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "(])";
        String s1 = "()";
        String s2 = "({[]})";

        System.out.println(verify(s));

    }

    static boolean verify(String s){
        Deque<Character> pilha = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if( currentChar == '{' || currentChar == '(' || currentChar == '[') {
                pilha.push(currentChar);
            }else if(pilha.isEmpty()){
                return false;
            }
            else if(pilha.peek() == '{' && currentChar == '}'
                    || pilha.peek() == '(' && currentChar == ')'
                    || pilha.peek() == '[' && currentChar == ']'){
                pilha.poll();
            }else{
                return false;
            }
        }
        return pilha.isEmpty();
    }
}
