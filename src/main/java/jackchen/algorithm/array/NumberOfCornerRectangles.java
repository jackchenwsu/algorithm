package jackchen.algorithm.array;

public class NumberOfCornerRectangles {

    /*
     * 750. Given a grid where each entry is only 0 or 1, find the number of corner rectangles.
     *      A corner rectangle is 4 distinct 1s on the grid that form an axis-aligned rectangle.
     *      Note that only the corners need to have the value 1. Also, all four 1s used must be distinct.
     */
    public int countCornerRectangles(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = i + 1; j < grid.length; j++) {
                int count = 0;
                for (int k = 0; k < grid[0].length; k++) {
                    if(grid[i][k] == 1 && grid[j][k] == 1) count++;
                }

                if(count > 0) sum += count * (count - 1) / 2;
            }
        }

        return sum;
    }
}
