package jackchen.algorithm.Math;

public class HammingWeight {

    /*
     * 191. Write a function that takes an unsigned integer and returns the number of '1' bits it has
     */
    public int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);

            // We need to use bit shifting unsigned operation >>> (while >> depends on sign extension)
            n = n>>>1;
        }
        return ones;
    }
}
