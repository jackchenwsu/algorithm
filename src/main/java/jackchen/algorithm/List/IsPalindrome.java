package jackchen.algorithm.List;

public class IsPalindrome {

    /*
     * 234. Given a singly linked list, determine if it is a palindrome.
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while(slow != null)
        {
            if(slow.val != fast.val) return false;

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode nextHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = nextHead;
            nextHead = head;
            head = next;
        }

        return nextHead;
    }
}
