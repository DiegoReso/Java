package leetcode;

public class MaxAdjacentDistance {
    public static void main(String[] args) {

        int nums[] = {-4,-2,-3};

        System.out.println(verify(nums));

    }

    static int verify(int[] nums) {

        int temp = 0;
        int adj = 0;
        for (int i = 0; i <= nums.length -1; i++) {

            if(i == 0){
                adj = ((nums[i]) - (nums[i +1])) < 0 ? ((nums[i]) - (nums[i +1])) *-1 : ((nums[i]) - (nums[i +1]));
                continue;
            }

            if(i == nums.length -1){
                temp = (nums[i]) - (nums[0]);
                temp = temp < 0 ? temp * -1 : temp;
                adj = temp > adj ? temp : adj;
            }else{
                temp = (nums[i]) - (nums[i +1]);
                temp = temp < 0 ? temp * -1 : temp;
                adj = temp > adj ? temp : adj;
            }
        }

        return adj;
    }
}
