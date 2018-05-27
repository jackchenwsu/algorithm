package jackchen.algorithm.array;

public class HouseRobber {

    /*
     * 198. You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
     *Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
     */

    public int rob(int[] nums) {
        int totalOdd = 0;
        int totalEven = 0;
        for(int i=0; i< nums.length; i++)
        {
            if (i%2==0) {
                totalEven = Math.max(totalEven+nums[i], totalOdd);
            }
            else {
                totalOdd = Math.max(totalOdd+ nums[i], totalEven);
            }
        }

        return totalEven > totalOdd ? totalEven : totalOdd;
    }
}
