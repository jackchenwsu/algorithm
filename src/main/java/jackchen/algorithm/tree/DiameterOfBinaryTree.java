package jackchen.algorithm.tree;

public class DiameterOfBinaryTree {
    public int dfs(TreeNode root)
    {
        if (root == null)
            return 0;

        int l1 = dfs(root.left);
        int l2 = dfs(root.right);

        return 1+ Math.max(l1, l2);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int height = dfs(root.left) + dfs(root.right);
        int maxDiameter = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return Math.max(height, maxDiameter);
    }
}
