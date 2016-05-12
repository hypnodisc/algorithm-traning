package com.jmlim.coding_test;

public class OverloadTest {
	public static void main(String[] args) {
		new OverloadTest().test();
	}

	private void test() {
		Fruits fruits = new Apple();
		System.out.println(fruits.getName());
	}

	public class Fruits {
		private String name;

		public Fruits() {
			this.name = "unknown";
		}

		final public String getName() {
			return name;
		}
	}

	public class Apple extends Fruits {
		/*public String getName() {
			return "Apple";
		}*/
	}
}
