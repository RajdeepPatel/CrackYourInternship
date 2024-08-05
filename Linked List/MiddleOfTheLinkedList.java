//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int mid = size / 2;
        current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current;

    }
    public static void main(String[] args) {
        // [1,2,3,4,5,6]
        ListNode ll = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode ll1 = ll;
        // Printing originasl ListNode
        System.out.println("Original ListNode");
        ll.printListNode(ll1);
        System.out.println("New List node");
        ListNode newListNode = middleNode(ll);
        ll.printListNode(newListNode);
    }
}