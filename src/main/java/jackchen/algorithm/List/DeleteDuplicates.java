package jackchen.algorithm.List;

public class DeleteDuplicates {

    /*
     * 83. Given a sorted linked list, delete all duplicates such that each element appear only once.
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode cur = head;
        while(cur != null && cur.next != null)
        {
            if (cur.val == cur.next.val)
            {
                cur.next = cur.next.next;
            }
            else
            {
                cur = cur.next;
            }
        }

        return head;
    }
}
