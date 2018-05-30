package jackchen.algorithm.Math;

public class Pow {

    /*
     * 50.  Implement pow(x, n), which calculates x raised to the power n (xn).
     */
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        if( n < 0) {
            if (n == Integer.MIN_VALUE) {
                n = Integer.MIN_VALUE;
                if(x<0) x=-x;
            }
            else {
                n = -n;
                x = 1 / x;
            }
        }

        return n%2 == 0? myPow(x*x, n/2) : x * myPow(x*x, n/2);
    }
}
