package com.jmlim.coding_test;

import java.io.IOException;

public class HandleException2 {
	// int a = 3.5;
	int a1 = 3;
	double a2 = (float) a1;
	int ab = 9 / 0;

	public static void main(String[] argv) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a == b);

		new HandleException2().test();
	}

	private void test() {
		try {
			Person person = new Person("John", -10);
		} catch (IOException e) {
			System.out.println("Exception catched");
		} finally {
			System.out.println("execute finally block");
		}
	}

	public class Person {
		private String name;
		private int age;

		public Person(String name, int age) throws IOException {
			if (age < 0)
				throw new IllegalParamException("Invalid input age :" + age);
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public class IllegalParamException extends RuntimeException {
		public IllegalParamException(String msg) {
			super(msg);
		}
	}
}
