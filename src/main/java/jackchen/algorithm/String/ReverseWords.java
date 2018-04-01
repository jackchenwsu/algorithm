package jackchen.algorithm.String;

public class ReverseWords {

    private void reverse(char[] str, int start, int end)
    {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    /*
     * 186. Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
     * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
     * For example,
     * Given s = "the sky is blue",
     * return "blue is sky the".
     */
    public void reverseWords(char[] str) {

        this.reverse(str, 0, str.length-1);

        int start=0;
        int end=-1;
        for (int i=0; i< str.length; i++) {
            if (str[i] == ' ')
            {
                this.reverse(str, start, i-1);
                start = i + 1;
            }
        }

        reverse(str, start, str.length-1);
    }
}
