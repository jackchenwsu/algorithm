package jackchen.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedInArray {

    /*
     * 448. Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i=0; i<nums.length; i++)
        {
            int val = Math.abs(nums[i])-1;
            if (nums[val]>0){
                nums[val] = -nums[val];
            }
        }

        for (int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                ret.add(i+1);
            }
        }

        return ret;
    }
}