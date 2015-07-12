import util.TreeNode;

/**
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest 
path from the root node down to the farthest leaf node.
 * @author 1qa
 *
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        int lheight = maxDepth(root.left) + 1;
        int rheight = maxDepth(root.right) + 1;
        return lheight > rheight ? lheight:rheight;
    }
}
