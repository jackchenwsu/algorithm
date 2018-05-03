package jackchen.algorithm.tree;

public class BuildTree {

    /*
     * 105. Given preorder and inorder traversal of a tree, construct the binary tree.
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return this.helper(0, 0, inorder.length-1, preorder, inorder);
    }

    /*
     * 106. Given inorder and postorder traversal of a tree, construct the binary tree.
     */
    public TreeNode buildTree2(int[] inorder, int[] postorder)
    {
        return this.helper2(0, inorder.length-1, 0,postorder.length-1, inorder, postorder);
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
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        root.left = this.helper(preStart+1, inStart, inIndex-1, preorder, inorder);
        root.right = this.helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);

        return root;
    }

    private TreeNode helper2(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder)
    {
        if(postStart > postEnd) return null;

        int inIndex = 0;
        for (int i=inStart; i<=inEnd; i++)
        {
            if(inorder[i] == postorder[postEnd])
            {
                inIndex = i;
                break;
            }
        }

        TreeNode root = new TreeNode(postorder[postEnd]);
        root.left = this.helper2(inStart, inIndex-1, postStart, postEnd - inEnd + inIndex - 1, inorder, postorder);
        root.right = this.helper2(inIndex+1, inEnd, postEnd - inEnd + inIndex, postEnd-1, inorder, postorder);

        return root;
    }
}
