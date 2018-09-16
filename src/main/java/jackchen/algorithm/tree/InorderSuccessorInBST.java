package jackchen.algorithm.tree;

public class InorderSuccessorInBST {

    /*
     * 285. Given a binary search tree and a node in it, find the in-order successor of that node in the BST.
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val <= p.val) {
            return inorderSuccessor(root.right, p);
        } else {
            TreeNode left = inorderSuccessor(root.left, p);
            return (left != null) ? left : root;
        }
    }

    /*
     * Given a binary search tree and a node in it, find the in-order predecessor of that node in the BST.
     */
    public TreeNode predecessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val >= p.val) {
            return predecessor(root.left, p);
        } else {
            TreeNode right = predecessor(root.right, p);
            return (right != null) ? right : root;
        }
    }
}
