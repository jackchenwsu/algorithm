package jackchen.algorithm.array;

public class MaximumProductSubarray {

    /*
     * 152. Find the contiguous subarray within an array (containing at least one number) which has the largest product.
     * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product = 6.
     */
    public int maxProduct(int[] nums) {
        int r = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = max;
                max = min;
                min = tmp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);


            r = Math.max(r, max);
        }

        return r;
    }
}