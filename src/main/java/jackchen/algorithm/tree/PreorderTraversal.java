package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

    private List<Integer> list = new ArrayList<Integer>();

    /*
     * 144. Given a binary tree, return the preorder traversal of its nodes' values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return list;

        list.add(root.val);

        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }
}
