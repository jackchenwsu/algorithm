package jackchen.algorithm.array;

public class ArrayNesting {

    /*
     * 565. A zero-indexed array A of length N contains all integers from 0 to N-1.
     *      Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.
     *      Suppose the first element in S starts with the selection of element A[i] of index = i,
     *      the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.
     */
    public int arrayNesting(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int res = 0;

        for (int i = 0; i< nums.length; i++) {
            if (!visited[i])
            {
                int start = nums[i], count = 0;

                do {
                    start = nums[start];
                    count++;
                    visited[start] = true;
                }
                while(start != nums[i]);

                res = Math.max(res, count);
            }
        }

        return res;
    }
}
