package jackchen.algorithm.tree;

public class MximumBinaryTree {

    /*
     * 654. Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
     * The root is the maximum number in the array.
     * The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
     * The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if (nums == null) return null;

        return constructMaximumBinaryTree(nums, 0, nums.length-1);
    }


    private TreeNode constructMaximumBinaryTree(int[] nums, int low, int high)
    {
        if (low > high) return null;

        int idxMax = low;
        for (int i = low + 1; i <= high; i++) {
            if (nums[i] > nums[idxMax]) {
                idxMax = i;
            }
        }

        TreeNode node = new TreeNode(nums[idxMax]);

        node.left = this.constructMaximumBinaryTree(nums, low, idxMax-1);
        node.right = this.constructMaximumBinaryTree(nums, idxMax+1, high);

        return node;
    }
}
