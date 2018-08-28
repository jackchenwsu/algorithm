package jackchen.algorithm.Math;

public class ExcelSheetColumnTitle {

    /*
     * 168. Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     */
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            n--;
            str.insert(0, (char)('A' + n % 26));
            n = n / 26;
        }

        return str.toString();
    }
}
