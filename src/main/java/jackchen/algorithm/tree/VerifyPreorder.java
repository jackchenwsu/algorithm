package jackchen.algorithm.tree;

import java.util.Stack;

public class VerifyPreorder {

    /*
     * 255. Given an array of numbers, verify whether it is the correct preorder traversal sequence of a binary search tree.
     * You may assume each number in the sequence is unique.
     */
    public boolean verifyPreorder(int[] preorder) {
        int low = Integer.MIN_VALUE;
        Stack<Integer> path = new Stack();

        for (int v : preorder)
        {
            if (v < low) return false;

            while (!path.empty() && v > path.peek())
            {
                low = path.pop();
            }

            path.push(v);
        }

        return true;
    }
}
