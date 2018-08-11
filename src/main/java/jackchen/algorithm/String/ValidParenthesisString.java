package jackchen.algorithm.String;

public class ValidParenthesisString {

    /*
     * 678. Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
     *      Any left parenthesis '(' must have a corresponding right parenthesis ')'.
     *      Any right parenthesis ')' must have a corresponding left parenthesis '('.
     *      Left parenthesis '(' must go before the corresponding right parenthesis ')'.
     *      '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
     *      An empty string is also valid.
     */
    public boolean checkValidString(String s) {
        int lo = 0, hi = 0;

        for (char c : s.toCharArray())
        {
            if (c == '(')
            {
                lo++;
                hi++;
            }
            else if (c == ')')
            {
                if (lo > 0) lo--;
                hi--;
            }
            else
            {
                if (lo > 0) lo--;
                hi++;
            }

            if (hi < 0)
                return false;
        }

        return lo == 0;
    }
}
