package jackchen.algorithm.array;

public class CountBattleships {

    /*
     * 419. Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
     *      You receive a valid board, made of only battleships or empty slots.
     *      Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
     *      At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
     */
    public int countBattleships(char[][] board) {
        int m = board.length;

        if (m == 0) return 0;

        int n = board[0].length;

        int count = 0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;

                if (j > 0 && board[i][j-1] == 'X') continue;
                if (i > 0 && board[i-1][j] == 'X') continue;

                count++;
            }
        }

        return count;
    }
}
