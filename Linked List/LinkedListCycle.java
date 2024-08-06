//https://leetcode.com/problems/linked-list-cycle/

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;

            if (hare == tortoise) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        boolean isCycle = hasCycle(listNode);
        System.out.println(isCycle);
    }
}
