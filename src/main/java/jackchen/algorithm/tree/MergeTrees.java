package jackchen.algorithm.tree;

public class MergeTrees {
    /*
     * 617. Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
     * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null) return t2;
        if (t2==null) return t1;

        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newTree = new TreeNode(val);

        newTree.left = mergeTrees(t1.left, t2.left);
        newTree.right = mergeTrees(t1.right, t2.right);

        return newTree;
    }
}
