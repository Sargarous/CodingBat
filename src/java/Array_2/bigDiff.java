package java.Array_2;
//Given an array length 1 or more of ints, return the difference between the
// largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
// and Math.max(v1, v2) methods return the smaller or larger of two values.
//
//
//        bigDiff([10, 3, 5, 6]) → 7
//        bigDiff([7, 2, 10, 9]) → 8
//        bigDiff([2, 10, 7, 2]) → 8

public class bigDiff {
    public int bigDiff(int[] nums) {
        int temp = 0;

        for (int i = 0; i <= nums.length-1; i++){
            if(i > i + 1)
            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + i] = temp;
        }
        return nums[nums.length-1] - nums[0];

//        boolean flag = true;
//        int temp = 0;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < nums.length - 1; i++) {
//                if (nums[i] > nums[i + 1]) {
//                    temp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return nums[nums.length-1] - nums[0];
    }



}
