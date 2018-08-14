package jackchen.algorithm.tree;

public class SplitBST {

    /*
     * 776. Given a Binary Search Tree (BST) with root node root, and a target value V, split the tree into two subtrees where one subtree has nodes that are all smaller or equal to the target value,
     *      while the other subtree has all nodes that are greater than the target value.  It's not necessarily the case that the tree contains a node with value V.
     *      Additionally, most of the structure of the original tree should remain.  Formally, for any child C with parent P in the original tree,
     *      if they are both in the same subtree after the split, then node C should still have the parent P.
     *      You should output the root TreeNode of both subtrees after splitting, in any order.
     */
    public TreeNode[] splitBST(TreeNode root, int V) {
        if (root == null)
            return new TreeNode[] {null, null};

        if (root.val > V)
        {
            TreeNode[] res = splitBST(root.left, V);
            root.left = res[1];
            res[1] = root;
            return res;
        }
        else
        {
            TreeNode[] res = splitBST(root.right, V);
            root.right  = res[0];
            res[0] = root;
            return res;
        }
    }
}
