//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next;
        while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println("Original LinkedList");
        listNode.printListNode(listNode);
        System.out.println("Reversed LinkedList");
        ListNode newListNode =   reverseList(listNode);
        newListNode.printListNode(newListNode);
    }
}
