package jackchen.algorithm.List;

import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunction {

    /*
     * 636. Given the running logs of n functions that are executed in a nonpreemptive single threaded CPU, find the exclusive time of these functions.
     */
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;
        for (String log : logs) {
            String[] parts = log.split(":");
            if (!stack.isEmpty()) res[stack.peek()] +=  Integer.parseInt(parts[2]) - prevTime;
            prevTime = Integer.parseInt(parts[2]);
            if (parts[1].equals("start")) stack.push(Integer.parseInt(parts[0]));
            else {
                res[stack.pop()]++;
                prevTime++;
            }
        }
        return res;
    }
}
