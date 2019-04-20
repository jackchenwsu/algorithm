package jackchen.algorithm.tree;

import java.util.*;

public class BinaryTreeOrderTraversal {

    /*
     * 102. Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();

        if (root != null) queue.add(root);

        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> array = new ArrayList<>();

            for (int i=0; i<levelSize; i++)
            {
                TreeNode tempNode = queue.poll();
                array.add(tempNode.val);

                if (tempNode.left != null)
                    queue.add(tempNode.left);

                if (tempNode.right != null)
                    queue.add(tempNode.right);
            }

            lists.add(array);
        }

        return lists;
    }
}
