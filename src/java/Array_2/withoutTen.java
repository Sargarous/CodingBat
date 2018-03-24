package java.Array_2;

//Return a version of the given array where all the 10's have been removed.
//The remaining elements should shift left towards the start of the array as needed,
// and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields
// {1, 2, 0, 0}. You may modify and return the given array or make a new array.
//
//
//        withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
//        withoutTen([10, 2, 10]) → [2, 0, 0]
//        withoutTen([1, 99, 10]) → [1, 99, 0]
public class withoutTen {
    public int[] withoutTen(int[] nums) {
        int count10 = 0;
        int not10= 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 10){
                arr[not10] = nums[i];
                not10++;
            }else{
                arr[nums.length - count10 - 1] = 0;
                count10++;
            }
        }
        return arr;
    }
}
