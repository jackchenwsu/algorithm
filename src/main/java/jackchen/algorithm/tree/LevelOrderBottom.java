package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderBottom {

    private List<List<Integer>> res = new ArrayList<List<Integer>>();

    public void levelOrderBottom(TreeNode node, int level)
    {
        if (node == null)
            return;

        if (res.size() == level)
        {
            res.add(new ArrayList<Integer>());
        }

        res.get(level).add(node.val);

        levelOrderBottom(node.left, level + 1);
        levelOrderBottom(node.right, level + 1);
    }

    /*
     * 107. Given a binary tree, return the bottom-up level order traversal of its nodes' values.
     * (ie, from left to right, level by level from leaf to root).
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        this.levelOrderBottom(root, 0);

        Collections.reverse(res);

        return res;
    }
}
