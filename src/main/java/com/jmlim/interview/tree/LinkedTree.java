package com.jmlim.interview.tree;

public class LinkedTree<T> {

	private TreeNode root;

	class TreeNode {
		T data;
		TreeNode left;
		TreeNode right;
	}

	public TreeNode makeBT(TreeNode tree1, T data, TreeNode tree2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = tree1;
		root.right = tree2;
		return root;
	}

	// 전위 순회
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	// 중위 순회
	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}

	// 후휘 순회
	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data);
		}
	}
}
