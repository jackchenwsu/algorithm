package jackchen.algorithm.List;

public class ReverseNodesinkGroup {

    /*
     * 25. Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     *     k is a positive integer and is less than or equal to the length of the linked list.
     *     If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while(cur != null && count < k)
        {
            cur = cur.next;
            count++;
        }

        if (count == k)
        {
            cur = this.reverseKGroup(cur, k);

            while(count-- > 0)
            {
                ListNode tmp = head.next;
                head.next = cur;
                cur = head;
                head = tmp;
            }

            return cur;
        }



        return head;
    }
}
