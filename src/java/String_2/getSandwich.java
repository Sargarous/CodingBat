package java.String_2;

/* A sandwich is two pieces of bread with something in between. Return the
 * string that is between the first and last appearance of "bread" in the
 * given string, or return the empty string "" if there are not two pieces
 * of bread.
 */

public class getSandwich {
    public String getSandwich(String str) {
        String res = "";
        int first = 0;
        int last = 0;

        for(int i = 0; i < str.length()-4; i++){
            if(str.substring(i, i+5).equals("bread") && (first != 0)){
                last = i;
            }
            if(str.substring(i, i+5).equals("bread") && (first == 0)){
                first = i + 5;
            }
        }
        if((first != 0) && (last != 0)){
            res = str.substring(first, last);
        }
        return res;
    }
}
