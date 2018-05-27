package jackchen.algorithm.Math;

public class TitleToNumber {

    /*
     * 171. Given a column title as appear in an Excel sheet, return its corresponding column number.
     */
    public int titleToNumber(String s) {
        if (s.isEmpty()) return 0;

        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            sum = sum * 26 + s.charAt(i) - 'A' + 1;
        }

        return sum;
    }
}
