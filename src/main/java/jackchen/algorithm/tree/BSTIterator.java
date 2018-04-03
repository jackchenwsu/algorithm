package jackchen.algorithm.tree;

import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = stack.pop();
        pushAll(tmp.right);
        return tmp.val;
    }

    private void pushAll(TreeNode node)
    {
        while(node!=null)
        {
            stack.push(node);
            node =node.left;
        }
    }
}
