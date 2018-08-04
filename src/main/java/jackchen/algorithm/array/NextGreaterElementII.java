package jackchen.algorithm.array;

import java.util.Stack;

public class NextGreaterElementII {

    /*
     * 503. Given a circular array (the next element of the last element is the first element of the array),
     *      print the Next Greater Number for every element. The Next Greater Number of a number x is
     *      the first greater number to its traversing-order next in the array, which means you could search circularly
     *      to find its next greater number. If it doesn't exist, output -1 for this number.
     */
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] results = new int[n];

        for (int i = n - 1; i >= 0; i--)
        {
            stack.push(i);
        }

        for (int i = n - 1; i >= 0; i--)
        {
            results[i]  = -1;

            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i])
            {
                stack.pop();
            }

            if (!stack.isEmpty())
            {
                results[i]  = nums[stack.peek()];
            }

            stack.push(i);
        }

        return results;
    }
}
