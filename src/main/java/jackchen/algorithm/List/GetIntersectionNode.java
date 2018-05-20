package jackchen.algorithm.List;

public class GetIntersectionNode {

    /*
     * 160. Write a program to find the node at which the intersection of two singly linked lists begins.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode p1 = headA;
        ListNode p2 = headB;


        while (p1 != p2)
        {
            p1 = p1 == null? headB : p1.next;
            p2 = p2 == null? headA : p2.next;
        }

        return p1;
    }
}
