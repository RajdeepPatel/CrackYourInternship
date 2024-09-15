public class DeletetheMiddleNodeOfALinkedList {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        if (head.next == null)
            return null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
            new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5)))));
        list1.printListNode(list1);
    
        ListNode result = deleteMiddle(list1);
        System.out.print("Result : ");
        result.printListNode(result);
      }
}

