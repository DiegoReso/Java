package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalidrome(121));

    }

    static boolean isPalidrome(int x){
        if(x < 0){
            return false;
        }
        int[] numArray = numToArray(x);
        int l = 0;
        int r = numArray.length -1;
        int fal = 0;
        while(l <= r){

           if(numArray[l] != numArray[r]) {
               fal++;
           }
           l++;
           r--;

        }
            return fal > 0 ? false : true;
    }

    static int[] numToArray(int x){

        String s = String.valueOf(x);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }

        return digits;
    }

}
