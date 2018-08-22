package jackchen.algorithm.array;

import java.util.Stack;

public class DailyTemperatures {

    /*
     * 739. Given a list of daily temperatures, produce a list that, for each day in the input,
     *      tells you how many days you would have to wait until a warmer temperature.
     *      If there is no future day for which this is possible, put 0 instead.
     *      For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i= temperatures.length - 1; i >= 0; i--) {

            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) stack.pop();

            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;

            stack.push(i);
        }

        return res;
    }
}
