package jackchen.algorithm.List;

public class DeleteNode {

    /*
     * 237. Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
