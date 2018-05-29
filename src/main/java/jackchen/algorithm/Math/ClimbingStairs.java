package jackchen.algorithm.Math;

public class ClimbingStairs {

    /*
     * 70. You are climbing a stair case. It takes n steps to reach to the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     */
    public int climbStairs(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int oneStep = 2;
        int twoStep = 1;
        int temp = 0;
        for (int i=2; i<=n; i++)
        {
            temp = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = temp;
        }

        return oneStep;
    }
}
