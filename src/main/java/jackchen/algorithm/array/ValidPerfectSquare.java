package jackchen.algorithm.array;

public class ValidPerfectSquare {

    /*
     * 367。 Given a positive integer num, write a function which returns True if num is a perfect square else False.
     */
    public boolean isPerfectSquare(int num) {
        int low = 0, high = num;

        while(low <= high)
        {
            long mid = (low + high) >> 1;

            if (mid * mid == num)
            {
                return true;
            }
            else if (mid * mid < num)
            {
                low = (int)mid + 1;
            }
            else
            {
                high = (int)mid - 1;
            }
        }

        return false;
    }
}
