package jackchen.algorithm.List;

public class SwapParis {

    /*
     * 24. Given a linked list, swap every two adjacent nodes and return its head.
     */
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        while(first != null || second != null)
        {
            int tmp = first.val;
            first.val = second.val;
            second.val = tmp;

            if (second.next == null || second.next.next == null) return head;

            first = second.next;
            second = second.next.next;
        }

        return head;
    }
}
