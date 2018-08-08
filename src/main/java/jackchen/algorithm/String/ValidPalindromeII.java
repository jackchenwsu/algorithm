package jackchen.algorithm.String;

public class ValidPalindromeII {

    /*
     * 680. Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
     */
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r)
        {
            if(s.charAt(l) != s.charAt(r)) return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            l++;
            r--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r)
        {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
