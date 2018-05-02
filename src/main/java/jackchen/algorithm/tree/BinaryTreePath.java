package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    private List<String> buildTreePaths(TreeNode node, String res)
    {
        List<String> list = new ArrayList<String>();

        if (node == null)
        {
            return list;
        }

        res = res + Integer.toString(node.val);
        if (node.left == null) {
            list.addAll(this.buildTreePaths(node.left, res + "->"));
        }

        if (node.right == null) {
            list.addAll(this.buildTreePaths(node.right, res + "->"));
        }

        list.add(res);

        return list;
    }

    public List<String> binaryTreePaths(TreeNode node) {
        return this.buildTreePaths(node, "");
    }
}