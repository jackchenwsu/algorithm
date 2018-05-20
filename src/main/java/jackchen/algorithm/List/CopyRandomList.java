package jackchen.algorithm.List;


import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

    /*
     * 138. A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
     * Return a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        RandomListNode node = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        while(node != null)
        {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while(node!=null)
        {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }
}
