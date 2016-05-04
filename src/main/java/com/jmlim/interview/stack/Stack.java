package com.jmlim.interview.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {

	private int top = -1;

	private int maxSize;

	private List<T> dataList;

	@SuppressWarnings("unused")
	private Stack() {
	}

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		dataList = new ArrayList<>(maxSize);
	}

	// push
	public void push(T data) throws MaxSizeOverException {
		if (maxSize <= top) {
			throw new MaxSizeOverException();
		}
		top++;
		dataList.add(data);

	}

	public T pop() {
		if (top < 0) {
			throw new EmptyStackException();
		}
		T data = dataList.remove(top);
		top--;
		return data;
	}

	public T peek() {
		if (top < 0) {
			throw new EmptyStackException();
		}
		return dataList.get(top);
	}

	// 스택이 비어있는지 체크
	public boolean empty() {
		return (top == -1);
	}

	// 스택이 꽉찼는지 체크
	public boolean full() {
		return (top == maxSize - 1);
	}
}
