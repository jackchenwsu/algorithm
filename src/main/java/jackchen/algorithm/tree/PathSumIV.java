package jackchen.algorithm.tree;

import java.util.HashMap;

public class PathSumIV {

    private int sum = 0;
    private HashMap<Integer, Integer> tree = new HashMap<>();

    /*
     * 666. f the depth of a tree is smaller than 5, then this tree can be represented by a list of three-digits integers.
     * For each integer in this list:
     * 1. The hundreds digit represents the depth D of this node, 1 <= D <= 4.
     * 2. The tens digit represents the position P of this node in the level it belongs to, 1 <= P <= 8. The position is the same as that in a full binary tree.
     * 3. The units digit represents the value V of this node, 0 <= V <= 9.
     * Given a list of ascending three-digits integers representing a binary with the depth smaller than 5. You need to return the sum of all paths from the root towards the leaves.
     */
    public int pathSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        for (int num : nums)
        {
            int key = num / 10;
            int value = num % 10;

            tree.put(key, value);
        }

        this.traverse(nums[0]/10, 0);

        return sum;
    }

    private void traverse(int root, int preSum)
    {
        int level = root/10;
        int pos = root%10;
        int left = (level + 1) * 10 + pos * 2 - 1;
        int right = (level + 1) * 10 + pos * 2;

        int curSum = preSum + tree.get(root);

        // Find the leaf node
        if (!tree.containsKey(left) && !tree.containsKey(right)) {
            sum += curSum;
            return;
        }

        if (tree.containsKey(left)) traverse(left, curSum);
        if (tree.containsKey(right)) traverse(right, curSum);
    }
}
