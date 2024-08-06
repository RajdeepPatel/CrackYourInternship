//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class ConvertBinaryNumberInALinkedListToInteger {
    public static int getDecimalValue(ListNode head) {
        ListNode current = head;
        String sum = "";
        while(current != null)
        {
            sum += Integer.toString(current.val);
            current = current.next;
        }

         int decimal = Integer.parseInt(sum, 2);
         return decimal;
    }  
    
    public static void main(String[] args) {
        ListNode ll = new ListNode(1,new ListNode(0, new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(0))))));
        int a=getDecimalValue(ll);
        System.err.println(a);
    }
}
