package jackchen.algorithm.String;

import java.util.Stack;

public class ValidParentheses {

    /*
     * 20. Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;

                char m1 = stack.pop();

                if (!isMatch(m1, s.charAt(i)))
                    return false;
            }
        }

        return stack.isEmpty();

    }

    private boolean isMatch(char c1, char c2) {
        if ((c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']')) {
            return true;
        }

        return false;
    }
}

