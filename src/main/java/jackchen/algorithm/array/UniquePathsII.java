package jackchen.algorithm.array;

public class UniquePathsII {

    /*
     * 63. A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid
     * Now consider if some obstacles are added to the grids.
     * How many unique paths would there be?
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        Integer[][] map = new Integer[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    map[i][j] = 0;
                }
                else if (i == 0 && j == 0) {
                    map[i][j] = 1;
                }
                else if (i == 0) {
                    map[i][j] = map[i][j-1];
                }
                else if (j == 0) {
                    map[i][j] = map[i-1][j];
                }
                else
                {
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
        }

        return map[m-1][n-1];
    }
}
