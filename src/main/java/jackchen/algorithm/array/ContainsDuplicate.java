package jackchen.algorithm.array;

import java.util.HashSet;

public class ContainsDuplicate {

    /*
     * 217. Given an array of integers, find if the array contains any duplicates.
     * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>(nums.length);
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }

            set.add(i);
        }

        return false;
    }

    /*
     * 219. Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }

    /*
     * 220. Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t
     * and the absolute difference between i and j is at most k.
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {


        return false;
    }
}