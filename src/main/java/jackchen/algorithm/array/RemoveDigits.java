package jackchen.algorithm.array;

import java.util.Stack;

public class RemoveDigits {

    /*
     * 402. Given a non-negative integer num represented as a string, remove k digits
     *      from the number so that the new number is the smallest possible.
     */
    public String removeKdigits(String num, int k) {

        if (k == num.length())
        {
            return "0";
        }

        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && !stk.isEmpty() && stk.peek() > num.charAt(i)) {
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
        }

        while (k > 0) {
            stk.pop();
            k--;
        }

        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty())
            sb.append(stk.pop());
        sb.reverse();

        //remove all the 0 at the head
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
