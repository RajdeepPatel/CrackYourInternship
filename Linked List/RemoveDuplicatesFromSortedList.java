//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode current=head;
        while(current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode ll = new ListNode(1,new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode ll1=deleteDuplicates(ll);
        ll.printListNode(ll1);
    }
}
