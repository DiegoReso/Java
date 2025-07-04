package leetcode;

public class ClimbStairs {

    public static void main(String[] args) {

        climb(3);

    }

    static int climb(int n){

        if(n == 1){
            return 1;
        }

        int prev = 1 , curr = 1;

        for (int i = 2; i <= n ; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        return curr;
    }
}
