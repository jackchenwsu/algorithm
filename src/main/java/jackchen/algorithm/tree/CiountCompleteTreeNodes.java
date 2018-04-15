package jackchen.algorithm.tree;

public class CiountCompleteTreeNodes {

    /*
     * 222. Given a complete binary tree, count the number of nodes.
     */
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = this.leftDepth(root);
        int rightDepth = this.rightDepth(root);

        if (leftDepth == rightDepth)
            return (1<<leftDepth) - 1;
        else
            return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int rightDepth(TreeNode root) {
        int dep = 0;
        while (root != null) {
            root = root.right;
            dep++;
        }
        return dep;
    }

    private int leftDepth(TreeNode root) {
        int dep = 0;
        while (root != null) {
            root = root.left;
            dep++;
        }
        return dep;
    }
}
