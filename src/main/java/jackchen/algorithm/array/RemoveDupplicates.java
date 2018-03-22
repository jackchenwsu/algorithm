package jackchen.algorithm.array;

public class RemoveDupplicates {
    /*
    * 26. Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
    */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j])
            {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }

    /*
     * 27. Given an array and a value, remove all instances of that value in-place and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     */
    public int removeElements2(int[] nums, int value)
    {
        int i=0;
        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] != value)
            {
                nums[i++] = nums[j];
            }
        }

        return i+1;
    }
}
