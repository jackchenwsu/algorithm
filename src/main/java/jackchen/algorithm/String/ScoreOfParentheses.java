package jackchen.algorithm.String;

import java.util.Stack;

public class ScoreOfParentheses {

    /*
     * 856. Given a balanced parentheses string S, compute the score of the string based on the following rule:
     *      () has score 1
     *      AB has score A + B, where A and B are balanced parentheses strings.
     *      (A) has score 2 * A, where A is a balanced parentheses string.
     */
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(char c : S.toCharArray())
        {
            if (c == '(')
                stack.push(0);
            else {
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2*v, 1));
            }
        }

        return stack.pop();
    }
}
