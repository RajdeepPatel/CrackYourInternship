//https://leetcode.com/problems/valid-number/description/
import java.util.regex.Pattern;

public class ValidNumber {
    public static boolean isNumber(String s) {
        String regex = "^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$";
        return Pattern.matches(regex,s);
    }

    public static void main(String[] args) {
        String s = ".";
        System.err.println(isNumber(s));
    }
}
