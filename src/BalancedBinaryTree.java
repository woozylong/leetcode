import util.TreeNode;
/**
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of 
the two subtrees of every node never differ by more than 1.
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
public class BalancedBinaryTree {
	public static boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		if(Math.abs(depth(root.left) - depth(root.right)) > 1)
			return false;
		
		return isBalanced(root.left) && isBalanced(root.right);
    }
	
	private static int depth(TreeNode root){
		if(root == null)
			return 0;
		int lheight = depth(root.left) + 1;
		int rheight = depth(root.right) + 1;
		return lheight > rheight?lheight:rheight;
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(8);
		TreeNode t4 = new TreeNode(11);
		TreeNode t5 = new TreeNode(13);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(2);
		TreeNode t9 = new TreeNode(1);
		t1.left = t2;t1.right = t3;
		t2.left = t4;
		t3.left = t5;t3.right = t6;
		t4.left = t7;t4.right = t8;
		t6.right = t9;
		System.out.println(isBalanced(t1));
	}
}
