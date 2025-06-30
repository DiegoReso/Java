package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        int[] num = {1,2,2,2,3};

        System.out.println(verify(num));
    }

    static int verify(int[] nums){
        int longestNumber = 0;
        int count =0;
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], numMap.getOrDefault(nums[i], 0)+1);
        }

        for (Integer num : numMap.keySet()){
            if(numMap.containsKey(num + 1)){
                count  = numMap.get(num) + numMap.get(num + 1);
                longestNumber = count > longestNumber ? count : longestNumber;
            }
        }
       return longestNumber;
    }
}
