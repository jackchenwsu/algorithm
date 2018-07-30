package jackchen.algorithm.array;

public class WiggleSubsequence {

    /*
     * 376. A sequence of numbers is called a wiggle sequence if the differences between successive numbers strictly alternate between positive and negative.
     * The first difference (if one exists) may be either positive or negative. A sequence with fewer than two elements is trivially a wiggle sequence.
     */
    public int wiggleMaxLength(int[] nums) {
        if( nums.length == 0 ) return 0;

        int up = 1;
        int down = 1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] < nums[i-1]) { down = up + 1; }
            else if (nums[i] > nums[i-1]) {up = down + 1; }
        }

        return Math.max(up, down);
    }
}
