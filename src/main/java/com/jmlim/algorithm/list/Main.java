package com.jmlim.algorithm.list;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.addFirst("임정묵");
		list.addFirst("임선영");
		list.addFirst("이계자");
		list.addFirst("임재근");
		list.addFirst("우리가족");

		list.addLast("아롱이");
		
		list.add(6, "ㅋㅋㅋ");
		System.out.println(list.toString());

	}
}
