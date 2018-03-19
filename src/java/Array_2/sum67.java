package java.Array_2;
//Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
//
//        sum67([1, 2, 2]) → 5
//        sum67([1, 2, 2, 6, 99, 99, 7]) → 5
//        sum67([1, 1, 6, 7, 2]) → 4

public class sum67 {
    public int sum67(int[] nums) {
        int res = 0;
        boolean skip = false;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 6){
                skip = true;
            }
            if(!skip){
                res += nums[i];
            }
            if(skip && nums[i] == 7){
                skip = false;
            }
        }
        return res;
    }
}
