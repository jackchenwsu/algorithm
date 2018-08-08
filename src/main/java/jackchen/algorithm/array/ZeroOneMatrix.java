package jackchen.algorithm.array;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {

    /*
     * 542. Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
     * The distance between two adjacent cells is 1.
     */
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[] {i, j});
                }
                else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty())
        {
            int[] cur = queue.pop();
            for (int[] dir : dirs)
            {
                int r = cur[0] + dir[0];
                int c = cur[1] + dir[1];
                if (r < 0 || r >= m || c < 0 || c >= n || matrix[r][c] <= matrix[cur[0]][cur[1]] + 1) continue;

                queue.add(new int[] {r, c});
                matrix[r][c] = matrix[cur[0]][cur[1]] + 1;
            }
        }

        return matrix;
    }
}