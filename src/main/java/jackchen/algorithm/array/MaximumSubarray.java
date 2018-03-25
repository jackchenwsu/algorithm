package jackchen.algorithm.array;

public class MaximumSubarray {
    /*
     * 53. Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
     * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
     * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
     */
    public int maxSubarray(int[] nums)
    {
        int maxLocal = nums[0];
        int maxGlobal = nums[0];

        for (int i=1; i< nums.length; i++)
        {
            maxLocal = Math.max(maxLocal + nums[i], nums[i]);
            maxGlobal = Math.max(maxGlobal, maxLocal);
        }

        return maxGlobal;
    }
}
