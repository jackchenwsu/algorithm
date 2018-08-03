package jackchen.algorithm.array;

import java.util.HashMap;

public class FourSumII {

    /*
     * 454. Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l)
     *      there are such that A[i] + B[j] + C[k] + D[l] is zero.
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j =0; j < D.length; j++) {
                int negativeSum = -1 * (C[i] + D[j]);
                res += map.getOrDefault(negativeSum, 0);
            }
        }

        return res;
    }
}
