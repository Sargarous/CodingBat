package java.String_2;
import java.util.Arrays;
//Given a string and a non-empty word string, return a string made
// of each char just before and just after every appearance of the
// word in the string. Ignore cases where there is no char before or
// after the word, and a char may be included twice if it is between two words.

public class wordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int strL = str.length();
        int woL = word.length();
        int i = 0;

        if(strL == woL && str.equals(word)){
            return "";
        }
        while (i <= strL - 1){
            if(i == 0 && str.substring(i, i + woL).equals(word)){
                result.append(str.charAt(i + woL));
                i+=woL;
            }else if(i == strL - woL && str.substring(strL - woL).equals(word)){
                result.append(str.charAt(strL -  woL - 1));
                i++;
            }else if(i < strL - woL && str.substring(i, i + woL).equals(word)){
                result.append(str.charAt(i - 1)).append(str.charAt(i + woL));
                i++;
            }else{
                i++;
            }
        }
        return result.toString();
    }
}
