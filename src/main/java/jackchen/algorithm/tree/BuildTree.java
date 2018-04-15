package jackchen.algorithm.tree;

public class BuildTree {

    /*
     * 105. Given preorder and inorder traversal of a tree, construct the binary tree.
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return this.helper(0, 0, inorder.length-1, preorder, inorder);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder)
    {
        if (preStart > preorder.length - 1 || inStart > inEnd) return null;

        int inIndex = 0;
        for (int i=inStart; i <= inEnd; i++)
        {
            if (inorder[i] == preorder[preStart])
            {
                inIndex = i;
            }
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        root.left = this.helper(preStart+1, inStart, inIndex-1, preorder, inorder);
        root.right = this.helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);

        return root;
    }
}
