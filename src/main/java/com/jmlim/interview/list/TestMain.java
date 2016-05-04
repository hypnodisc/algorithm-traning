package com.jmlim.interview.list;

public class TestMain {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("jmlim");
		list.addFirst("okjsp");
		list.addFirst("kkkk");
		list.addLast("임정묵");
		list.addLast("임선영");
		list.add(2, "개정묵");
		list.add(2, "ㅋㅋㅋ");
		// list.add(2, "개정묵잊ㅋㅋ");
		System.out.println(list.toString());

		list.removeFirst();
		System.out.println(list.toString());
		list.remove(3);
		 System.out.println(list.toString());
	}
}
