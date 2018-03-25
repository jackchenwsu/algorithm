package jackchen.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class MajorElements {

    /*
     * 169 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     * You may assume that the array is non-empty and the majority element always exist in the array.
     */
    public int majorELements(int[] nums)
    {
        Map<Integer, Integer>  map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }

        int majorElements = 0;
        for(int i=0; i<nums.length; i++)
        {
            if (map.get(nums[i]) > nums.length/2)
            {
                majorElements = nums[i];
            }
        }

        return majorElements;
    }
}
