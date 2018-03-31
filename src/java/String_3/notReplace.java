package java.String_3;
//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
// The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does
// not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//
//        notReplace("is test") → "is not test"
//        notReplace("is-is") → "is not-is not"
//        notReplace("This is right") → "This is not right"
public class notReplace {
    public String notReplace(String str) {
        StringBuilder temp = new StringBuilder(" ");
        temp.append(str);
        temp.append(" ");

        for (int i = 1; i < temp.length() - 2; i++) {
            if ((temp.substring(i, i + 2).equals("is")
                    && !Character.isLetter(temp.charAt(i - 1))
                    && !Character.isLetter(temp.charAt(i + 2)))) {
                temp.replace(i, i + 2, "is not");
            }
        }
        return temp.toString().trim();
    }
}
