package jackchen.algorithm.tree;


import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    private List<List<Integer>> lists = new ArrayList<>();

    /*
     * 113. Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> temp = new ArrayList<>();

        this.getPathSum(root, sum, temp);

        return lists;

    }

    private void getPathSum(TreeNode root, int sum, List<Integer> temp)
    {
        if (root == null) return;

        temp.add(root.val);

        // Reached the leaf
        if (root.left == null && root.right == null && root.val == sum)
        {
            lists.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }

        getPathSum(root.left, sum - root.val, temp);
        getPathSum(root.right, sum - root.val, temp);

        temp.remove(temp.size() - 1);
        return;
    }
}
