package com.gl.dsaLab3.problem2;

import java.util.Stack;

//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BSTPairSum {
	public static void findPair(TreeNode root, int sum) {
		if (root == null) {
			System.out.println("Nodes not found");
			return;
		}

		// Create two stacks to store In-order traversals of the tree
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();

		TreeNode current1 = root, current2 = root;
		boolean done1 = false, done2 = false;
		int val1 = 0, val2 = 0;

		while (true) {
			// Find the next node in the first traversal
			while (!done1) {
				if (current1 != null) {
					stack1.push(current1);
					current1 = current1.left;
				} else {
					if (stack1.isEmpty())
						done1 = true;
					else {
						current1 = stack1.pop();
						val1 = current1.val;
						current1 = current1.right;
						done1 = true;
					}
				}
			}

			// Find the next node in the second traversal
			while (!done2) {
				if (current2 != null) {
					stack2.push(current2);
					current2 = current2.right;
				} else {
					if (stack2.isEmpty())
						done2 = true;
					else {
						current2 = stack2.pop();
						val2 = current2.val;
						current2 = current2.left;
						done2 = true;
					}
				}
			}

			// If we have completed both traversals, break
			if (val1 >= val2)
				break;

			// If we have found a pair with the given sum, print it and return
			if (val1 + val2 == sum) {
				System.out.println("Pair is (" + val1 + "," + val2 + ")");
				return;
			}

			// If the sum is less than the current pair, move to the next node in the first
			// traversal
			else if (val1 + val2 < sum)
				done1 = false;

			// If the sum is greater than the current pair, move to the next node in the
			// second traversal
			else if (val1 + val2 > sum)
				done2 = false;
		}

		// If no pair is found, print "Nodes not found"
		System.out.println("Nodes not found");
	}
}
