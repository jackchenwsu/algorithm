package jackchen.algorithm.List;

public class AddTwoNumbers {

    /*
     * 445. You are given two non-empty linked lists representing two non-negative integers.
     *       The most significant digit comes first and each of their nodes contain a single digit.
     *       Add the two numbers and return it as a linked list.
     *       You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p = reverseList(l1);
        ListNode q = reverseList(l2);

        ListNode head = new ListNode(0);
        ListNode cur=head;
        int carry = 0;
        while(p!=null||q!=null||carry!=0)
        {
            int curVal = ((p != null) ? p.val : 0) + ((q != null) ? q.val : 0) + carry;
            carry = curVal/10;
            ListNode curNode = new ListNode(curVal%10);
            cur.next=curNode;
            cur=curNode;
            if(p!=null) {p = p.next;}
            if(q!=null) {q = q.next;}
        }

        return reverseList(head.next);
    }

    public ListNode reverseList(ListNode head) {
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
}
