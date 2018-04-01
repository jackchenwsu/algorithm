package jackchen.algorithm.array;

public class SearchRotatedSortedArray {

    /*
     * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
     * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
     * You are given a target value to search. If found in the array return its index, otherwise return -1.
     */
    public int search(int[] nums, int target)
    {
        if (nums.length == 0 || nums == null)
        {
            return -1;
        }

        int lo = 0;
        int hi = nums.length-1;

        while(lo<hi)
        {
            int mid = (lo+hi)/2;
            if (nums[mid] == target) return mid;

            if(nums[lo]<=nums[mid])
            {
                if(nums[lo]<=target&&nums[mid]>=target)
                {
                    hi = mid - 1;
                }
                else
                {
                    lo = mid + 1;
                }
            }
            else
            {
                if (nums[mid]<=target&&nums[hi]>=target)
                {
                    lo = mid + 1;
                }
                else
                {
                    hi = mid - 1;
                }
            }
        }

        return nums[lo]==target?lo:-1;
    }
}
