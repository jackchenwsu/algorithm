package jackchen.algorithm.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    /*
     * 39. Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
     * find all unique combinations in candidates where the candidate numbers sums to target.
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);

        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return;

        if (remain == 0 )
        {
            list.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++ )
        {
            tempList.add(candidates[i]);
            backtrack(list, tempList, candidates, remain-candidates[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
}