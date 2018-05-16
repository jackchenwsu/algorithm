package jackchen.algorithm.List;

public class ReorderList {
    /*
     * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
     * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
     */
    public ListNode reorderList2(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;

        ListNode lastNode = head;
        while(lastNode.next.next != null)
        {
            lastNode = lastNode.next;
        }

        ListNode temp = head.next;
        head.next = lastNode.next;
        lastNode.next.next = temp;
        lastNode.next = null;

        return head.next.next;
    }

    public void reorderList(ListNode head) {
        ListNode tmp = head;
        while(tmp != null)
        {
            tmp = reorderList2(tmp);
        }
    }
}
