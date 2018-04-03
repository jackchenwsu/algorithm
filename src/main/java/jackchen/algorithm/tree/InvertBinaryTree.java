package jackchen.algorithm.tree;

public class InvertBinaryTree {

    /*
     * 226. Invert a binary tree.
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
