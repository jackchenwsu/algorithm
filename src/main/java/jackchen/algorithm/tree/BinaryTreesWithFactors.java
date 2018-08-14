package jackchen.algorithm.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {

    /*
     * 823. Given an array of unique integers, each integer is strictly greater than 1.
     *      We make a binary tree using these integers and each number may be used for any number of times.
     *      Each non-leaf node's value should be equal to the product of the values of it's children.
     *      How many binary trees can we make?  Return the answer modulo 10 ** 9 + 7.
     */

    public int numFactoredBinaryTrees(int[] A)
    {
        long MOD = (long)Math.pow(10, 9) + 7;

        long[] dp = new long[A.length];
        Arrays.fill(dp, 1);

        Arrays.sort(A);

        Map<Integer, Integer> index = new HashMap();
        for (int i = 0; i < A.length; ++i)
            index.put(A[i], i);


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i]%A[j] == 0) {
                    int right = A[i] / A[j];
                    if (index.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j]*dp[index.get(right)])%MOD;
                    }
                }
            }
        }

        long ans = 0;
        for (long x: dp) ans += x;
        return (int) (ans % MOD);
    }
}