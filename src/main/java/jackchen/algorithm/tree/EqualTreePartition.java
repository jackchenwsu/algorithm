package jackchen.algorithm.tree;

import java.util.Stack;

public class EqualTreePartition {

    Stack<Integer> stack = new Stack<>();
    /*
     * 663. Given a binary tree with n nodes, your task is to check if it's possible to partition the tree to two trees
     *      which have the equal sum of values after removing exactly one edge on the original tree.
     */
    public boolean checkEqualTree(TreeNode root) {

        int total = sumTree(root);
        stack.pop();

        if (total % 2 != 0)
            return false;

        for (int s: stack)
        {
            if (s == total / 2)
                return true;
        }

        return false;
    }

    private int sumTree(TreeNode root)
    {
        if (root == null) return 0;

        stack.push(sumTree(root.left) + sumTree(root.right) + root.val);

        return stack.peek();
    }
}
