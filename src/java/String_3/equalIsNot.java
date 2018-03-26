package java.String_3;

//Given a string, return true if the number of appearances of "is" anywhere in the string is equal
// to the number of appearances of "not" anywhere in the string (case sensitive).
//
//
//        equalIsNot("This is not") → false
//        equalIsNot("This is notnot") → true
//        equalIsNot("noisxxnotyynotxisi") → true
public class equalIsNot {
    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 2).equals("is")){
                countIs++;
            }
            if(i == str.length() - 3 && str.substring(i + 1,  i + 3).equals("is")){
                countIs++;
            }
            if(str.substring(i, i + 3).equals("not")){
                countNot++;
            }
        }
        return countIs == countNot;
    }
}
