package jackchen.algorithm.tree;

import java.util.HashSet;

public class FindTarget {

    HashSet<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;

        if (set.contains(k - root.val))
            return true;

        set.add(root.val);

        boolean left = findTarget(root.left, k);
        boolean right = findTarget(root.right, k);

        return left || right;
    }
}