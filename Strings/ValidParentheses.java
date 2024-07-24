//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParentheses {
    public static  boolean isValid(String s) {
       Stack<Character> stack = new Stack();
       for(int  i=0;i<s.length();i++){
        char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.add(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top  = stack.pop();
                if(ch == ')' && top != '('){
                    return false;
                }
                if(ch == '}' && top != '{'){
                    return false;
                }
                if(ch == ']' && top != '['){
                    return false;
                }
            }
       } 
       return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="(){}[]";
        System.err.println(isValid(s));
    }
}
