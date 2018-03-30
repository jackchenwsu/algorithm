package jackchen.algorithm.array;

public class MissingNumber {

    /*
     * 268. Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
     */
    public int missingNumber(int[] nums)
    {
        int len = nums.length;
        int totalSum = len*(len+1)/2;
        int missingSum = 0;
        for(int i=0; i<len; i++)
        {
            missingSum += nums[i];
        }

        return totalSum - missingSum;
    }
}
