package jackchen.algorithm.tree;

public class AnnotatedNode {
    TreeNode node;
    int depth, pos;

    AnnotatedNode(TreeNode n, int d, int p) {
        node = n;
        depth = d;
        pos = p;
    }
}