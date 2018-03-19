package java.Array_2;
//Given an array of ints, return true if it contains no 1's or it contains no 4's.
//
//        no14([1, 2, 3]) → true
//        no14([1, 2, 3, 4]) → false
//        no14([2, 3, 4]) → true

public class no14 {
    public boolean no14(int[] nums) {
        boolean flag1 = true;
        boolean flag4 = true;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                flag1 = false;
            }
            if(nums[i] == 4){
                flag4 =  false;
            }
        }
        return (flag1 || flag4);
    }
}
