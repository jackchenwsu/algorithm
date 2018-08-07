package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateSubtrees {

    /*
     * 652. Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees,
     *      you only need to return the root node of any one of them.
     *      Two trees are duplicate if they have the same structure with same node values.
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        HashMap<String, Integer> subTreesMap = new HashMap<>();
        postOrderTraverse(root, subTreesMap, treeNodeList);

        return treeNodeList;
    }

    private String postOrderTraverse(TreeNode root, HashMap<String, Integer> map, List<TreeNode> res)
    {
        if (root == null) return "#";

        String s = root.val + ',' + postOrderTraverse(root.left, map, res) + ',' + postOrderTraverse(root.right, map, res);

        if (map.getOrDefault(s, 0) == 1) res.add(root);
        map.put(s, map.getOrDefault(s, 0) + 1);

        return s;
    }
}
