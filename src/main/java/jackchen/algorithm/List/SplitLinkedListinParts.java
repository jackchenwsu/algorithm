package jackchen.algorithm.List;

public class SplitLinkedListinParts {

    /*
     * 725. Given a (singly) linked list with head node root,
     *      write a function to split the linked list into k consecutive linked list "parts".
     */
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];

        int len = 0;
        ListNode cur = root;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        int w = len / k, r = len % k;
        cur = root;
        ListNode pre = null;
        for (int i = 0; cur!=null && i<k; i++, r--) {
            parts[i] = cur;
            for (int j = 0; j < w + (r > 0 ? 1 : 0); j++) {
                pre = cur;
                if (cur != null) cur = cur.next;
            }
            pre.next = null;
        }

        return parts;
    }
}
