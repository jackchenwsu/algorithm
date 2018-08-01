package jackchen.algorithm.String;

import java.util.Stack;

public class DecodeString {

    /*
     * 394. Given an encoded string, return it's decoded string. The encoding rule is: k[encoded_string],
     *      where the encoded_string inside the square brackets is being repeated exactly k times. Note that
     *      k is guaranteed to be a positive integer.
     */
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> numStack = new Stack<Integer>();
        Stack<String> resStack = new Stack<String>();

        int idx  = 0;

        while( idx < s.length())
        {
            if (Character.isDigit(s.charAt(idx)))
            {
                int count = 0;
                while(Character.isDigit(s.charAt(idx))){
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }

                numStack.add(count);
            }
            else if (s.charAt(idx) == '[')
            {
                resStack.add(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']')
            {
                StringBuilder str = new StringBuilder(resStack.pop());
                int repeat = numStack.pop();
                for (int i = 0; i < repeat; i++)
                {
                    str.append(res);
                }

                res = str.toString();
                idx++;
            }
            else
            {
                res += s.charAt(idx++);
            }
        }

        return res;
    }
}
