package jackchen.algorithm.array;

import java.util.HashMap;
import java.util.List;

public class BrickWall {

    /*
     * 554. There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
     *       The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks.
     *       The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in this row from left to right.
     */
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                if (map.containsKey(sum)) {
                    map.replace(sum, map.get(sum)+1);
                }
                else
                {
                    map.put(sum, 1);
                }
            }
        }

        int res = wall.size();
        for (int key : map.keySet())
        {
            res = Math.min(res, wall.size() - map.get(key));
        }

        return res;
    }
}
