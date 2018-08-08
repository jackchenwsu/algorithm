package jackchen.algorithm.array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class IncreasingSubsequences {

    /*
     * 491. Given an integer array, your task is to find all the different possible increasing subsequences of the given array,
     * and the length of an increasing subsequence should be at least 2 .
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        addList(0, nums, list, res);

        return res;
    }

    private void addList(int start, int[] nums, LinkedList<Integer> list, List<List<Integer>> res)
    {
        if (list.size() > 1) res.add(new LinkedList<Integer>(list));

        HashSet<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if(set.contains(nums[i])) continue;;

            if(list.size() == 0 || nums[i] >= list.peekLast()) {
                set.add(nums[i]);
                list.add(nums[i]);
                addList(i+1, nums, list, res);
                list.remove(list.size()-1);
            }
        }
    }
}
