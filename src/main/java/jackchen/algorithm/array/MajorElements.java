package jackchen.algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    /*
     * 229. Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
     * The algorithm should run in linear time and in O(1) space.
     */
    public List<Integer> majorityElement2(int[] nums) {
        List<Integer> majorityNums = new ArrayList<>();
        if (nums == null || nums.length == 0) return majorityNums;

        int count1=0, count2=0, candidate1=nums[0], candidate2=nums[0];

        for (int n : nums)
        {
            if (n == candidate1)
            {
                count1 += 1;
            }
            else if (n == candidate2)
            {
                count2 += 1;
            }
            else if (count1 == 0)
            {
                candidate1 = n;
                count1 = 1;
            }
            else if (count2 == 0)
            {
                candidate2 = n;
                count2 = 1;
            }
            else
            {
                count1 = count1 - 1;
                count2 = count2 - 1;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int n: nums)
        {
            if (n == candidate1)
            {
                count1++;
            }

            if (n == candidate2)
            {
                count2++;
            }
        }

        if (count1 > nums.length/3) majorityNums.add(candidate1);
        if (count2 > nums.length/3 && candidate1 != candidate2) majorityNums.add(candidate2);

        return majorityNums;
    }
}
