package jackchen.algorithm.array;

public class DeleteOperationTwoStrings {

    /*
     * 583. Given two words word1 and word2, find the minimum number of steps required to make word1 and word2 the same,
     *      where in each step you can delete one character in either string.
     */
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];

        for(int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else {
                    dp[i][j] = word1.charAt(i-1) == word2.charAt(j-1) ? dp[i-1][j-1] + 1 : Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return word1.length() + word2.length() - 2 * dp[word1.length()][word2.length()];
    }
}
