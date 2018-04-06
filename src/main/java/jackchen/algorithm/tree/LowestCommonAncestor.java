package jackchen.algorithm.tree;

public class LowestCommonAncestor {
    /*
     * 235. Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants
     * (where we allow a node to be a descendant of itself).
     */
    public TreeNode lowestCommonAncestorForBalancedSearchTree(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val-p.val)*(root.val-q.val) >0)
        {
            root = p.val < root.val ? root.left : root.right;
        }

        return root;
    }

    /*
     * 236. Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
     */
    public TreeNode lowestCommonAncestorForBalancedTree(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        root.left = this.lowestCommonAncestorForBalancedTree(root.left, p, q);
        root.right = this.lowestCommonAncestorForBalancedTree(root.right, p, q);

        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        return root;
    }
}
