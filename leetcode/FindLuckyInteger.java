package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger {

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,3,3};

        System.out.println(verify(nums));

    }

    static int verify(int[] arr){
        int count = 0;
        Map<Integer,Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                count = entry.getKey();
            }
        }
        return count > 0 ? count : -1;
    }
}
