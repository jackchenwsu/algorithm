package jackchen.algorithm.String;

import java.util.Stack;

public class ParseTernary {

    /*
     * 439. Given a string representing arbitrarily nested ternary expressions, calculate the result of the expression. You can always assume that the given expression is valid and
     *     only consists of digits 0-9, ?, :, T and F (T and F represent True and False respectively).
     */
    public String parseTernary(String expression) {
        if (expression == null || expression.length() == 0) return "";
        Stack<Character> stack = new Stack<Character>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (!stack.isEmpty() && stack.peek() == '?') {
                stack.pop(); // Pop ?
                char left = stack.pop();
                stack.pop(); // Pop :
                char right = stack.pop();

                stack.push(c == 'T' ? left : right);
            } else {
                stack.push(c);
            }
        }

        return String.valueOf(stack.peek());
    }
}
