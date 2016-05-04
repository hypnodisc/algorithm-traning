package com.jmlim.interview.list;

public class LinkedList<T> {

	private Node head;

	private Node tail;

	private int size = 0;

	private class Node {
		private T data;
		// private Node prev;
		private Node next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(T data) {
		Node newNode = new Node(data);
		newNode.next = head;
		size++;
		head = newNode;

		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(T data) {
		if (size == 0) {
			addFirst(data);
			return;
		}

		Node newNode = new Node(data);
		// 위에 head 랑 같다고 생각 해볼때
		tail.next = newNode;
		tail = tail.next;
		size++;
	}

	private Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	public T get(int index) {
		Node temp = node(index);
		return temp.data;
	}

	public void add(T data) {
		addLast(data);
	}

	public void add(int index, T data) {
		if (index == 0) {
			addFirst(data);
		}
		Node newNode = new Node(data);
		Node temp1 = node(index - 1);
		Node temp2 = temp1.next;

		newNode.next = temp2;
		temp1.next = newNode;

		size++;
		// 새로운 노드의 다음 노드가 없다면 마지막 노드이므로 꼬리
		if (newNode.next == null) {
			tail = newNode;
		}
	}

	public T removeFirst() {
		if (head != null) {
			T data = head.data;
			head = head.next;
			size--;
			return data;
		}
		return null;
	}

	public T remove(int index) {
		if (index == 0) {
			return removeFirst();
		}
		Node temp1 = node(index - 1);
		Node temp2 = temp1.next;
		T data = temp2.data;
		temp2 = temp2.next;
		temp1.next = temp2;

		size--;
		// if (temp2 == tail) {
		// tail = temp1;
		// }
		return data;
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}
		// 탐색을 시작합니다.
		Node temp = head;
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		while (temp != null) {
			builder.append(temp.data);
			builder.append(",");
			temp = temp.next;
		}
		builder.append("]");
		return builder.toString();
	}
}
