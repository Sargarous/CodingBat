package java.Logic_2;

public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {

        int res = 0;
        int bigs = goal/5;
        if(bigs >= big){
            bigs = big;
        }
        res = goal - bigs*5;
        if((goal > small + big * 5) || (goal%5 > small)){
            res = -1;
        }
        return res;
    }
}
