package jackchen.algorithm.array;

public class FindMinimumRotateSortedArray {

    /*
     * 153. Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
     * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
     */
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end)
        {
            if (nums[start] < nums[end])
            {
                return nums[start];
            }

            int mid = (start + end)/2;

            if (nums[mid] >= nums[start])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }

        return nums[start];
    }
}
