import java.util.*;
public class BackspaceStringCompare{
    public static  boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#' && !s1.isEmpty()) {
                s1.pop();
            } else if (ch != '#') {
                s1.add(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#' && !s2.isEmpty()) {
                s2.pop();
            } else if (ch != '#') {
                s2.add(ch);
            }
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s1="ab#c",s2="ad#c";
        boolean a=backspaceCompare(s1,s2);
        System.err.println(a);
    }
}