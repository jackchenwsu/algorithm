package jackchen.algorithm.array;

public class RangeSumQuery {

    private int[] sums;

    /*
     * 303. Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
     */
    public RangeSumQuery(int[] nums) {

        for (int i = 1; i < nums.length; i++)
        {
            nums[i] += nums[i-1];
        }

        this.sums = nums;
    }

    public int sumRange(int i, int j) {
        return i == 0 ? sums[j] : sums[j] - sums[i-1];
    }
}
