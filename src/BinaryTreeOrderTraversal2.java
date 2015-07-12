import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 * @author 1qa
 *
 */
public class BinaryTreeOrderTraversal2 {
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	 public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		 List<List<Integer>> levellist = new ArrayList<List<Integer>>();
		 int level = 0;
		 if(root == null)
			 return levellist;
		 traverse(levellist,level,root);
		 return levellist;
	 }
	 static void traverse(List<List<Integer>> levellist,int level,TreeNode root){
		 if(root == null) return;
		 
		 if(levellist.size() <= level){
			 levellist.add(0,new ArrayList<Integer>());
		 }
		 
		 levellist.get(levellist.size() - level - 1).add(root.val);
		 
		 traverse(levellist,level+1,root.left);
		 traverse(levellist,level+1,root.right);
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
			System.out.println(levelOrderBottom(t1));
		}
}
