package java.Logic_2;

//Given 3 int values, a b c, return their sum. However, if one of the values is the
// same as another of the values, it does not count towards the sum.
//
//
//        loneSum(1, 2, 3) → 6
//        loneSum(3, 2, 3) → 2
//        loneSum(3, 3, 3) → 0
public class loneSum {
    public int loneSum(int a, int b, int c) {
        int x = a;
        int y = b;
        int z = c;

        if (a == b){
            x=0;
            y=0;
        }
        if(a == c){
            x=0;
            z=0;
        }
        if(b == c){
            y=0;
            z=0;
        }
        return x+y+z;
    }
}
