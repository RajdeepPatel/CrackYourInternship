//https://leetcode.com/problems/reverse-words-in-a-string/description/

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String s) {
        String trimedOgString = s.trim();
        String[] str = trimedOgString.split("\\s+");
        int n = str.length;
        String[] newStr = new String[n];
        for(int i=0;i<n; i++){
           newStr[i] = str[str.length-i-1];
        }
        return Arrays.toString(newStr).replace("[","").replace("]","").replace(",","");
    }



    public static void main(String[] arg) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }

}
