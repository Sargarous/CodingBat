package java.String_3;

//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
// A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char
// is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//
//        sumNumbers("abc123xyz") → 123
//        sumNumbers("aa11b33") → 44
//        sumNumbers("7 11") → 18
import java.lang.*;

public class sumNumbers {

    public static int sumNumbers(String str) {
        int res = 0;
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && Character.isDigit(str.charAt(i))) {
                res += Integer.parseInt(str.substring(i));
            }
            if (Character.isDigit(str.charAt(i))) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (i != str.length() - 1 && Character.isDigit(str.charAt(j))) {
                        count++;
                    } else {
                        res += Integer.parseInt(str.substring(i, i + count));
                        i += count - 1;
                        count = 1;
                        break;
                    }
                    if (j == str.length() - 1 && Character.isDigit(str.charAt(j))) {
                        res += Integer.parseInt(str.substring(i, i + count));
                        i += count - 1;
                    }
                }
            }
        }
        return res;
    }
}

