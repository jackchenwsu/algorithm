package jackchen.algorithm.Math;

public class TrailingZeros {

    /*
     * 172. Given an integer n, return the number of trailing zeroes in n!.
     */
    public int trailingZeroes(int n) {
        return n == 0? 0 : n/5 + trailingZeroes(n/5);
    }
}
