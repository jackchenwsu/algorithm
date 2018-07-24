package jackchen.algorithm.Search;

public class SearchInsert {

    /*
     * 35. Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     */
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
