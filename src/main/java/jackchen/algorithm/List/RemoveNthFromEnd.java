package jackchen.algorithm.List;

public class RemoveNthFromEnd {
    /*
     * 19. Given a linked list, remove the n-th node from the end of list and return its head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while (n-- != 0){
            fast = fast.next;
        }

        if (fast == null) return head.next;

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}