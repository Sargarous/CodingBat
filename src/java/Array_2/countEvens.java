package java.Array_2;

//Return the number of even ints in the given array.
// Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

//        countEvens([2, 1, 2, 3, 4]) → 3
//        countEvens([2, 2, 0]) → 3
//        countEvens([1, 3, 5]) → 0

public class countEvens {
    public static int countEvens(int[] nums) {
        int i = 0;
        int count = 0;

        while (i <= nums.length - 1){
            if(nums[i]%2 == 0){
                count++;
                i++;
            }else {
                i++;
            }
        }
        return count;
    }
    public static void main (String[]args){
        System.out.println(countEvens(new int[] {100, 0, 5, 3, 4}));
    }
}
