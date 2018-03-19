package java.String_2;

//Return a version of the given string, where for every star (*) in the string
// the star and the chars immediately to its left and right are gone. So "ab*cd"
// yields "ad" and "ab**cd" also yields "ad".

public class starOut {
    public String starOut(String str) {
        StringBuilder result = new StringBuilder(str);

        if(result.length() == 1 && result.charAt(0) == '*'){
            return "";
        }
        for(int i = 0; i <= result.length()-2; i++){
            if(result.charAt(0) == '*'){
                result.delete(0, 2);
                i = 0;
            }else if(result.charAt(result.length()-1) == '*'){
                result.delete(result.length()-2, result.length());
                i = 0;
            }else if(result.charAt(i) == '*' && result.charAt(i + 1) == '*' && result.charAt(i + 2) == '*'){
                result.delete(i - 1, i + 4);
                i = 0;
            }else if(result.charAt(i) == '*' && result.charAt(i + 1) == '*'){
                result.delete(i - 1, i + 3);
                i = 0;
            }else if(result.charAt(i) == '*' && (result.charAt(i + 1) != '*')){
                result.delete(i - 1, i + 2);
                i = 0;
            }
        }
        return result.toString();
    }
}
