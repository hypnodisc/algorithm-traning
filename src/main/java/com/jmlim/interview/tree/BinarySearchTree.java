package com.jmlim.interview.tree;

public class BinarySearchTree {
	private TreeNode root = new TreeNode();

	class TreeNode {
		char data;
		TreeNode left;
		TreeNode right;
	}

	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;

		if (p == null) {
			return newNode;
		} else if (newNode.data < p.data) {
			p.left = insertKey(p.left, x);
			return p;
		} else if (newNode.data > p.data) {
			p.right = insertKey(p.right, x);
			return p;
		} else {
			return p;
		}
	}

	public void insertBST(char x) {
		root = insertKey(root, x);
	}

	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while (p != null) {
			if (x < p.data)
				p = p.left;
			else if (x > p.data)
				p = p.right;
			else
				return p;
		}
		return p;
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(" " + root.data);
			inOrder(root.right);
		}
	}

	public void printBST() {
		inOrder(root);
		System.out.println();
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertBST('G');
		bst.insertBST('I');
		bst.insertBST('H');
		bst.insertBST('D');
		bst.insertBST('B');
		bst.insertBST('M');
		bst.insertBST('N');
		bst.insertBST('A');
		bst.insertBST('J');
		bst.insertBST('E');
		bst.insertBST('Q');

		System.out.printf("\n binary tree >>");

		bst.printBST();

		System.out.println("Is There A ?>>>");

		TreeNode p1 = bst.searchBST('A');
		if (p1 != null) {
			System.out.println("searching success : " + p1.data);
		} else {
			System.out.println("searching fail");
		}

		System.out.println("Is There Z ?>>>");

		TreeNode p2 = bst.searchBST('Z');
		if (p2 != null) {
			System.out.println("searching success : " + p2.data);
		} else {
			System.out.println("searching fail");
		}

	}
}
