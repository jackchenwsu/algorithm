package jackchen.algorithm.tree;

public class TrimBinarySearchTree {

    /*
     * 669. Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L).
     * You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
     */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;

        if (root.val < L) return this.trimBST(root.right, L, R);
        if (root.val > R) return this.trimBST(root.left, L, R);

        root.left = this.trimBST(root.left, L, R);
        root.right = this.trimBST(root.right, L, R);

        return root;
    }
}
