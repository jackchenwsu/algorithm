package jackchen.algorithm.array;

public class MaxRotateFunction {

    /*
     * 396. Given an array of integers A and let n to be its length.
     * Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:
     * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
     * Calculate the maximum value of F(0), F(1), ..., F(n-1).
     *
     * Hint: F(k+1) = F(k) + Sum - nBk[n-1]
     */
    public int maxRotateFunction(int[] A) {
        // Calculate F(1)
        int n = A.length;
        int F = 0;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            F += i * A[i];
            sum += A[i];
        }

        int maxF = F;
        for (int i = 1; i < n; i++)
        {
            F = F + sum - n*A[n - i];
            if (F > maxF)
            {
                maxF = F;
            }
        }


        return maxF;
    }
}
