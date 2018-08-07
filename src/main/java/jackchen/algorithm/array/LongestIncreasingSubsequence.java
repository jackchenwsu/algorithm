package jackchen.algorithm.array;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    /*
     * 300. Given an unsorted array of integers, find the length of longest increasing subsequence.
     */
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int maxLIS = 0;
        for (int i = 0; i < nums.length; i++) {
            int tempMax = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    tempMax = Math.max(tempMax, dp[j]);
                }
            }

            dp[i] = tempMax + 1;
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int len = 0;
        for(int num : nums)
        {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = - (i+1);
            }

            dp[i] = num;

            if (i == len) {
                len++;
            }
        }

        return len;
    }
}
