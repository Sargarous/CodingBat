package java.String_2;

//Look for patterns like "zip" and "zap" in the string -- length-3,
//starting with 'z' and ending with 'p'. Return a string where for
//all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


public class zipZap {
    public String zipZap(String str) {
        StringBuilder result = new StringBuilder(str);
        int n = 1;
        for(int i = 0; i <= str.length()-3; i++){
            if(str.charAt(i) == 'z' && str.charAt(i + 2) == 'p' ){
                result.deleteCharAt(i+n);
                n--;
            }
        }
        return result.toString();
    }
}
