package com.greatLearning.gp2;

import java.io.*;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}

class SkewedTree {

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void BSTToSkewed(Node root) {
		if (root == null) {
			return;
		}

		BSTToSkewed(root.left);
		Node rightNode = root.right;
		// Node leftNode = root.left;
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		BSTToSkewed(rightNode);

	}

	static void TraverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		TraverseRightSkewed(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkewedTree tree = new SkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		BSTToSkewed(node);
		TraverseRightSkewed(headNode);

	}

}
