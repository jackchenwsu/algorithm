package jackchen.algorithm.tree;

public class PopulateNextPointer {

    /*
     * 116. Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
     * Initially, all next pointers are set to NULL.
     */
    public void connect(TreeLinkNode root) {
        if(root == null || root.left == null) return;
        connectNodes(root.left, root.right);
    }

    private void connectNodes(TreeLinkNode node1, TreeLinkNode node2) {
        node1.next = node2;
        if(node1.left != null) {
            connectNodes(node1.right, node2.left);
            connectNodes(node1.left, node1.right);
            connectNodes(node2.left, node2.right);
        }
    }
}
