package leetcode;

public class MaximumDifferenceBetweenIncreaseElem {
    public static void main(String[] args) {

        int[] nums = {1,5,2,10};
        System.out.println(verify(nums));

    }

    static int verify(int[] nums){
        int minElement = nums[0];
        int max_diff = -1;
        for (int j = 1; j < nums.length; j++) {

            if((nums[j] - minElement) > max_diff ){
                max_diff = nums[j] - minElement;
            }

            if(nums[j] < minElement){
                minElement = nums[j];
            }

        }
        return max_diff == 0 ? -1 : max_diff;

    }
}
