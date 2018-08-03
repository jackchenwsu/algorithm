package jackchen.algorithm.tree;

public class PathSumIII {
    /*
     * 437. You are given a binary tree in which each node contains an integer value.
     *      Find the number of paths that sum to a given value.
     *      The path does not need to start or end at the root or a leaf,
     *      but it must go downwards (traveling only from parent nodes to child nodes).
     */
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int findPath(TreeNode root, int sum){
        int res = 0;
        if(root == null)
            return res;
        if(sum == root.val)
            res++;
        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;
    }
}
