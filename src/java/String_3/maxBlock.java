package java.String_3;

//Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//
//
//        maxBlock("hoopla") → 2
//        maxBlock("abbCCCddBBBxx") → 3
//        maxBlock("") → 0
public class maxBlock {
    public int maxBlock(String str) {
        int temp = 1;
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                temp++;
            }else{
                temp = 1;
            }
            if(temp > count){
                count = temp;
            }
        }
        return count;
    }

}
