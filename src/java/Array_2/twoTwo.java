package java.Array_2;

//Given an array of ints, return true if every 2 that appears in the array is
// next to another 2.
//
//
//        twoTwo([4, 2, 2, 3]) → true
//        twoTwo([2, 2, 4]) → true
//        twoTwo([2, 2, 4, 2]) → false
public class twoTwo {
    public boolean twoTwo(int[] nums) {
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                if( nums.length > 1 && i < nums.length - 1 && nums[i + 1] == 2){
                    flag = true;
                }else if(nums.length > 1 && i > 0 && nums[i - 1] == 2){
                    flag = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
