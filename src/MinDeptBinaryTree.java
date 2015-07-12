import util.TreeNode;

/**
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path 
from the root node down to the nearest leaf node.
 * @author 1qa
 *
 */
public class MinDeptBinaryTree {
	public int minDepth(TreeNode root) {
        if(root == null)
        	return 0;
        if(root.left == null)return minDepth(root.right) + 1;//���Ϊ��˵���Ƿ�ĩ�ڵ㣬����ѡ���ұߵ����
        if(root.right == null)return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}
