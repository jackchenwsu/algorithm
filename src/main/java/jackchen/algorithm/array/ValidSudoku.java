package jackchen.algorithm.array;

import java.util.HashSet;

public class ValidSudoku {

    /*
     * 36. Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
     *     1. Each row must contain the digits 1-9 without repetition.
     *     2. Each column must contain the digits 1-9 without repetition.
     *     3. Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     */
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> blocks = new HashSet<>();

            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && !rows.add(board[i][j]))
                {
                    return false;
                }

                if (board[j][i] != '.' && !columns.add(board[j][i]))
                {
                    return false;
                }

                int rowBase = 3 * (i/3);
                int columnBase = 3 * (i%3);
                if (board[rowBase + j/3][columnBase + j%3] != '.' && !blocks.add(board[rowBase + j/3][columnBase + j%3]))
                {
                    return false;
                }
            }
        }

        return true;
    }
}
