package jackchen.algorithm.List;

public class ReverseLinkedList {
    /*
     * 206. Reverse a singly linked list.
     */
    public ListNode reverseList1(ListNode head) {
        ListNode nextHead = null;
        while (head != null)
        {
            ListNode next = head.next;
            head.next = nextHead;
            nextHead = head;
            head = next;
        }

        return nextHead;
    }

    public ListNode reverseList2(ListNode head) {

        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}
