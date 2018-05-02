package jackchen.algorithm.tree;

public class Flatten {

    private TreeNode prev = null;

    public void Flatten(TreeNode root)
    {
        if (root == null)
            return;

        Flatten(root.right);
        Flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
