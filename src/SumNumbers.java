import java.util.Stack;

import util.*;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,
 * 
 * 1 / \ 2 3 The root-to-leaf path 1->2 represents the number 12. The
 * root-to-leaf path 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 * @author 1qa
 *
 */
public class SumNumbers {
	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		int sum = 0;
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.right != null) {
				node.right.val = node.val * 10 + node.right.val;
				stack.push(node.right);
			}
			if (node.left != null) {
				node.left.val = node.val * 10 + node.left.val;
				stack.push(node.left);
			}
			if (node.left == null && node.right == null) {
				sum += node.val;
			}
		}
		return sum;
	}
}
