package leetcode;

public class ReverseString {

    public static void main(String[] args) {

        char[] chars = {'h','e','l','l','o'};
        reverseString(chars);


    }

    public static void reverseString(char[] s){
        int l = 0;
        int r = s.length -1;

        while(l <= r){
            char temp;
            temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }

        System.out.println(s);
    }
}
