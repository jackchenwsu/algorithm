package jackchen.algorithm.array;

public class SearchRange {

    /*
     * 34.  Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
     */
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};

        if (nums == null || nums.length == 0) return res;

        int i = 0;
        int j = nums.length - 1;

        while(i < j)
        {
            int mid = (i + j) >> 1;
            if (nums[mid] < target) i = mid + 1;
            else j = mid;
        }

        if (nums[i] != target) return res;

        res[0] = i;

        j = nums.length - 1;
        while(i < j)
        {
            int mid = (i + j) >> 1 + 1;
            if (nums[mid] > target) j = mid - 1;
            else i = mid;
        }

        res[1] = j;
        return res;
    }
}
