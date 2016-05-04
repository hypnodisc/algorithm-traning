package com.jmlim.algorithm.list;

public class LinkedList<T> {

	private Node head;

	private Node tail;

	private int size;

	private class Node {
		private T data;
		private Node next;

		public Node(T data) {
			super();
			this.data = data;
		}

		public String toString() {
			return String.valueOf(data);
		}
	}

	// TODO addFirst(T data)
	public void addFirst(T data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

		if (newNode.next == null) {
			tail = head;
		}
		size++;
	}

	public void addLast(T data) {
		if (size == 0) {
			addFirst(data);
		}
		Node newNode = new Node(data);
		tail.next = newNode;
		tail = tail.next;
		size++;
	}

	// TODO node(int)
	private Node node(int index) {
		if (size < index) {
			throw new IndexOutOfBoundsException();
		}

		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}

		return node;
	}

	public void add(int index, T data) {
		if (size < index) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			addFirst(data);
		}

		Node newNode = new Node(data);
		Node prevNode = node(index - 1);
		Node nextNode = prevNode.next;

		newNode.next = nextNode;
		prevNode.next = newNode;

		size++;

		if (nextNode == null) {
			tail = newNode;
		}
	}

	public String toString() {
		Node temp = head;
		int commaCheck = 0;
		StringBuilder builder = new StringBuilder();
		while (temp != null) {
			if (commaCheck > 0) {
				builder.append(",");
			}
			commaCheck++;
			builder.append(temp.data);
			temp = temp.next;
		}
		return builder.toString();
	}
	// TODO addLast(T data)
	// TODO add(int index, T data)
	// TODO node(int);
	// TODO get(int);
	// TODO get(data);
}
