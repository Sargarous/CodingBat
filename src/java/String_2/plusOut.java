package java.String_2;

//Given a string and a non-empty word string, return a version of the
// original String where all chars have been replaced by pluses ("+"),
// except for appearances of the word string which are preserved unchanged.

public class plusOut {
    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder(str);
        int woL = word.length();
        int resL = result.length();

        for (int i = 0; i <= str.length() - 1; i++) {

            if (i <= (resL - woL) && result.substring(i, i + woL).equals(word)) {
                result.replace(i, i + woL, word);
                i += woL - 1;
            } else {
                result.replace(i, i + 1, "+");
            }
        }
        return result.toString();
    }
}
