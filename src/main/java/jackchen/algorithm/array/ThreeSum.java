package jackchen.algorithm.array;

import java.util.Arrays;

public class ThreeSum {

    /*
     * 16. Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
     * Return the sum of the three integers.
     * You may assume that each input would have exactly one solution.
     */
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++)
        {
            int start = i+1, end=nums.length-1;

            while(start<end)
            {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum > target)
                {
                    end--;
                }
                else {
                    start++;
                }

                if (Math.abs(sum-target) < Math.abs(result-target))
                {
                    result = sum;
                }
            }
        }

        return result;
    }
}
