package com.jmlim.coding_test;

public class Poliymorphism {
	private void f() {
		System.out.println("base class");
	}

	public static void main(String[] argv) {
		Poliymorphism po = new Poliymorphism().new Derived();
		po.f();
	}

	class Derived extends Poliymorphism {
		public void f() {
			System.out.println("sub class");
		}
	}
}
