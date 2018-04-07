package jackchen.algorithm.tree;

public class BalancedBinaryTree {
    private int getTreeHeight(TreeNode root)
    {
        if (root == null) return 0;

        return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
    }

    /*
     * 110. Given a binary tree, determine if it is height-balanced.
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) return false;

        if (Math.abs(this.getTreeHeight(root.left) - this.getTreeHeight(root.right)) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
