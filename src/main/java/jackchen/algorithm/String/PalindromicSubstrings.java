package jackchen.algorithm.String;

public class PalindromicSubstrings {

    int count = 0;

    /*
     * 647. Given a string, your task is to count how many palindromic substrings in this string.
     *      The substrings with different start indexes or end indexes are counted as different
     *      substrings even they consist of same characters.
     */
    public int countSubstrings(String s) {

        // Loop for the each substring middle
        for (int i = 0; i < s.length(); i++) {
            countPalindromic(s, i, i);
            countPalindromic(s, i, i+1);
        }

        return count;
    }

    private void countPalindromic(String s, int left, int right)
    {
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
    }
}
