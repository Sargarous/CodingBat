package java.Array_2;

//Return the "centered" average of an array of ints, which we'll
// say is the mean average of the values, except ignoring the largest
// and smallest values in the array. If there are multiple copies of
// the smallest value, ignore just one copy, and likewise for the largest
// value. Use int division to produce the final average. You may assume
// that the array is length 3 or more.
//
//
//        centeredAverage([1, 2, 3, 4, 100]) → 3
//        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

public class centeredAverage {
    public int centeredAverage(int[] nums) {
        boolean flag = true;
        int temp = 0;
        int sum = 0;
        while(flag){
            flag = false;
            for(int i = 0; i <= nums.length - 2; i++){
                if(nums[i] < nums[i + 1]){
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    flag = true;
                }
            }
        }
        for(int j = 1; j <= nums.length - 2; j++){
            sum += nums[j];
        }
        return sum/(nums.length - 2);
    }
}
