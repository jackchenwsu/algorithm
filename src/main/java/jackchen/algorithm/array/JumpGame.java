package jackchen.algorithm.array;

public class JumpGame {

    /*
     * 35 Given an array of non-negative integers, you are initially positioned at the first index of the array.
     * Each element in the array represents your maximum jump length at that position.
     * Determine if you are able to reach the last index.
     */
    public Boolean canJumpI(int[] nums)
    {
        int num = nums.length;
        int lastPosition = num - 1;

        for(int i = num - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPosition)
            {
                lastPosition = i;
            }
        }

        return lastPosition == 0;
    }

    /*
    * 75 Given an array of non-negative integers, you are initially positioned at the first index of the array.
    * Each element in the array represents your maximum jump length at that position.
    * Your goal is to reach the last index in the minimum number of jumps.
    */
    public int jumpTimes(int[] A) {
        int jumps = 0, end = 0, farthest = 0;
        for (int i = 0; i < A.length - 1; i++) {
            farthest = Math.max(farthest, i + A[i]);

            if (i==end)
            {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }
}
