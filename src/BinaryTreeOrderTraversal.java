import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 * @author 1qa
 *
 */
public class BinaryTreeOrderTraversal {
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	 public static List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		 if(root == null) return list;
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 queue.add(root);
	     while(!queue.isEmpty()){
	    	 List<Integer> ls = new ArrayList<Integer>();
	    	 int levelSize = queue.size();
	    	 for(int i = 0;i < levelSize;i++){
	    		 TreeNode node = queue.peek();
	    		 if(node.left != null) queue.offer(node.left);
	    		 if(node.right != null) queue.offer(node.right);
	    		 ls.add(queue.poll().val);
	    	 } 
	    	 list.add(ls);
	     }
	     return list;
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
			System.out.println(levelOrder(t1));
		}
}
