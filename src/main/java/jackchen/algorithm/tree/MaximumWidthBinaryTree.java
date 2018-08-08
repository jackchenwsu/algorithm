package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumWidthBinaryTree {

    /*
     * 662. Given a binary tree, write a function to get the maximum width of the given tree.
     *      The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree,
     *      but some nodes are null.
     *      The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level,
     *      where the null nodes between the end-nodes are also counted into the length calculation.
     */
    public int widthOfBinaryTree(TreeNode root) {
        Queue<AnnotatedNode> queue = new LinkedList();
        queue.add(new AnnotatedNode(root, 0, 0));
        int curDepth = 0, mostLeft = 0, res = 0;

        while (!queue.isEmpty())
        {
            AnnotatedNode a = queue.poll();
            if (a.node != null)
            {
                queue.add(new AnnotatedNode(root.left, a.depth + 1, 2 * a.pos));
                queue.add(new AnnotatedNode(root.right, a.depth + 1, 2 * a.pos + 1));

                if (curDepth != a.depth) {
                    curDepth = a.depth;
                    mostLeft = a.pos;
                }

                res = Math.max(res, a.pos - mostLeft + 1);
            }
        }

        return res;
    }

    /*
     * The dfs solution
     *
     */
    public int widthOfBinaryTree2(TreeNode root) {
        return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
    }

    public int dfs(TreeNode root, int level, int order, List<Integer> start, List<Integer> end){
        if(root == null)return 0;
        if(start.size() == level){
            start.add(order); end.add(order);
        }
        else end.set(level, order);
        int cur = end.get(level) - start.get(level) + 1;
        int left = dfs(root.left, level + 1, 2*order, start, end);
        int right = dfs(root.right, level + 1, 2*order + 1, start, end);
        return Math.max(cur, Math.max(left, right));
    }
}
