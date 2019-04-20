package jackchen.algorithm.array;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new LinkedList();
        for (int i=0; i<numRows; i++)
        {
            List<Integer> newRow = new LinkedList();
            for (int j=0; j<=i; j++)
            {
                if (j==0 || j==i)
                {
                    newRow.add(1);
                }
                else
                {
                    newRow.add(rows.get(i-1).get(j-1)+rows.get(i-1).get(j));
                }
            }

            rows.add(newRow);
        }

        return rows;
}

}
