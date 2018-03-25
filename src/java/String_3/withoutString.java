package java.String_3;
//Given two strings, base and remove, return a version of the base string where all instances of the remove string have
// been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping
// instances, so with "xxx" removing "xx" leaves "x".
//
//
//        withoutString("Hello there", "llo") → "He there"
//        withoutString("Hello there", "e") → "Hllo thr"
//        withoutString("Hello there", "x") → "Hello there"
public class withoutString {
    public String withoutString(String base, String remove) {
        StringBuilder res = new StringBuilder(base);
        int x = 0;

        for(int i = 0; i <= base.length() - remove.length(); i++){
            if(i - x >= 0 && res.substring(i - x, i + remove.length() - x).equalsIgnoreCase(remove)){
                res.delete(i - x, i + remove.length() - x);
                x += remove.length();
            }
        }
        return res.toString();
    }
}
