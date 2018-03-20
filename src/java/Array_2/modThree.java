package java.Array_2;
//Given an array of ints, return true if the array contains either 3
// even or 3 odd values all next to each other.
//
//
//        modThree([2, 1, 3, 5]) → true
//        modThree([2, 1, 2, 5]) → false
//        modThree([2, 4, 2, 5]) → true

public class modThree {
    public boolean modThree(int[] nums) {
        int isEven = 0;
        int isOdd = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                isEven++;
            }else if(isEven <3){
                isEven = 0;
            }
            if(nums[i] % 2 == 1){
                isOdd++;
            }else if(isOdd < 3){
                isOdd = 0;
            }
        }
        return isEven >= 3 || isOdd >= 3;
    }
}
