package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] numbers = {15, 7, 11, 2};
        int target = 13;

    }

    public static int[] sum(int[] nums, int target) {

        Map<Integer,Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)){
               return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
