package jackchen.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrees {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return this.genTrees(1, n);
    }

    List<TreeNode> genTrees(int start, int end)
    {
        List<TreeNode> list = new ArrayList<TreeNode>();

        if (start == end)
        {
            list.add(new TreeNode(start));
            return list;
        }

        if (start > end)
        {
            list.add(null);
            return list;
        }

        for (int i = start; i <= end; i++)
        {
            List<TreeNode> lefts = this.genTrees(start, i-1);
            List<TreeNode> rights = this.genTrees(i+1, end);

            for (TreeNode left : lefts)
            {
                for (TreeNode right: rights)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }

        return list;
    }
}
