package jackchen.algorithm.array;

public class TicTacToe {

    private int[] rows;

    private int[] columns;

    private int directions;

    private int antDirections;

    public TicTacToe(int n)
    {
        rows = new int[n];
        columns = new int[n];
    }

    public int move(int row, int col, int player) {

        int point = player == 1 ? 1 : -1;
        int size = rows.length;

        rows[row] += point;
        columns[col] += point;

        if (row == col)
        {
            this.directions += point;
        }

        if (row + col == size - 1)
        {
            this.antDirections += point;
        }

        if (Math.abs(rows[row]) == size||
                Math.abs(columns[col]) == size ||
                Math.abs(this.directions) == size ||
                Math.abs(this.antDirections) == size)
        {
            return player;
        }

        return 0;

    }
}
