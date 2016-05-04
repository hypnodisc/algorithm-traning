package com.jmlim.algorithm.tree;

public class SimpleTree<T> {
	private TreeNode<T> root;

	public TreeNode<T> makeBT(TreeNode<T> left, T data, TreeNode<T> right) {
		root = new TreeNode<T>(left, data, right);
		return root;
	}

	public void preOrder(TreeNode<T> root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(TreeNode<T> root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}

	public void postOrder(TreeNode<T> root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getData());
		}
	}
}
