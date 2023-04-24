package com.gl.dsaLab3.problem2;

public class Driver {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(60);
		root.left = new TreeNode(30);
		root.right = new TreeNode(70);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(40);
		root.right.left = new TreeNode(50);
		root.right.right = new TreeNode(80);

		int sum = 130;
		// For the sum=130 the Pair is (60,70)
		BSTPairSum.findPair(root, sum);
	}

}
