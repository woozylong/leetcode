package util;
/**
 * Binary Tree
 * @author 1qa
 *
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) {
		val = x;
	}
	
	public static TreeNode getTree(){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(3);
//		TreeNode t6 = new TreeNode(4);
//		TreeNode t7 = new TreeNode(7);
//		TreeNode t8 = new TreeNode(2);
//		TreeNode t9 = new TreeNode(1);
		t1.left = t2;t1.right = t3;
		t2.right = t4;
		t3.left = t5;
		//t3.right = t6;
//		t4.left = t7;t4.right = t8;
//		t6.right = t9;
		return t1;
	}
}