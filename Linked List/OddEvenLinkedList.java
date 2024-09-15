public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode oddIndex = new ListNode(0);
        ListNode oddIndexCopy = oddIndex;

        ListNode evenIndex = new ListNode(0);
        ListNode evenIndexCopy = evenIndex;

        int i = 1;
        while (head != null) {
            ListNode node = new ListNode();
            if (i % 2 == 0) {
                node.val = head.val;
                evenIndex.next = node;
                evenIndex = evenIndex.next;
            } else {
                node.val = head.val;
                oddIndex.next = node;
                oddIndex = oddIndex.next;
            }
            i++;
            head = head.next;
        }
        oddIndex.next = evenIndexCopy.next;
        dummyHead = oddIndexCopy;
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
            new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5)))));
        list1.printListNode(list1);
    
        ListNode result = oddEvenList(list1);
        System.out.print("Result : ");
        result.printListNode(result);
      }
}

