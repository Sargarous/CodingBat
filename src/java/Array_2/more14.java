package java.Array_2;
//Given an array of ints, return true if the number of 1's is greater than the number of 4's
//
//        more14([1, 4, 1]) → true
//        more14([1, 4, 1, 4]) → false
//        more14([1, 1]) → true

public class more14 {
    public boolean more14(int[] nums) {
        int sum1 = 0;
        int sum4 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum1++;
            }
            if(nums[i] == 4){
                sum4 += 4;
            }
        }
        return sum1 > sum4/4;
    }
}
