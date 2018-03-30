package jackchen.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    /*
     * 228. Given a sorted integer array without duplicates, return the summary of its ranges.
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> strings = new ArrayList<String>();
        for(int s=0, e=0; e<nums.length; e++)
        {
            if(e==nums.length-1 || nums[e]+1 != nums[e+1])
            {
                if(s==e)
                {
                    strings.add(Integer.toString(nums[s]));
                }
                else
                {
                    strings.add(Integer.toString(nums[s]) + "->" + Integer.toString(nums[e]));
                }
                s = e+1;
            }
        }

        return strings;
    }
}
