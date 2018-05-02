package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;


        if (root.left != null)
            list.addAll(inorderTraversal(root.left));

        list.add(root.val);


        if (root.right != null)
            list.addAll(inorderTraversal(root.right));

        return list;
    }
}
