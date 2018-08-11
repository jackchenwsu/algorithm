package jackchen.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayintoConsecutiveSubsequence {
    /*
     * 659. You are given an integer array sorted in ascending order (may contain duplicates),
     *      you need to split them into several subsequences, where each subsequences consist
     *      of at least 3 consecutive integers. Return whether you can make such a split.
     */
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(), appendPrev = new HashMap<>();
        for (int i : nums) freq.put(i, freq.getOrDefault(i,0) + 1);
        for (int i : nums) {
            if (freq.get(i) == 0) continue;
            else if (appendPrev.getOrDefault(i,0) > 0) {
                appendPrev.put(i, appendPrev.get(i) - 1);
                appendPrev.put(i+1, appendPrev.getOrDefault(i+1,0) + 1);
            }
            else if (freq.getOrDefault(i+1,0) > 0 && freq.getOrDefault(i+2,0) > 0) {
                freq.put(i+1, freq.get(i+1) - 1);
                freq.put(i+2, freq.get(i+2) - 1);
                appendPrev.put(i+3, appendPrev.getOrDefault(i+3,0) + 1);
            }
            else return false;
            freq.put(i, freq.get(i) - 1);
        }
        return true;
    }
}
