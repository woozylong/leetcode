import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3]
 * @author Administrator
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePreorderTraversal {
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
        if(root == null)
        	return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode treeNode = stack.pop();
        	list.add(treeNode.val);
        	if(treeNode.right != null){
        		 stack.push(treeNode.right);
        	}
        	if(treeNode.left != null){
        		stack.push(treeNode.left);
        	}
        }
        return list;
    }
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.right = node2;
		node2.left = node3;
		List<Integer> list = preorderTraversal(node1);
		for(int i : list){
			System.out.println(i);
		}
	}
}
