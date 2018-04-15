package jackchen.algorithm.tree;

public class KthSmallestElement {

    /*
     * 230. Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
     */
    public int kthSmallest(TreeNode root, int k) {
        int count = this.countNodes(root.left);

        if (count >= k)
            return kthSmallest(root.left, k);
        else if (count + 1 < k)
            return kthSmallest(root.right, k - count -1);

        return root.val;
    }

    private int countNodes(TreeNode root)
    {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}