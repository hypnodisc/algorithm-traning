package com.jmlim.interview.annotation;

public class NewServiceTester implements ProductTester {

	@MyTest
	public boolean serviceTest() {
		System.out.println("NewServiceTester test 수행");
		return false;
	}
}
