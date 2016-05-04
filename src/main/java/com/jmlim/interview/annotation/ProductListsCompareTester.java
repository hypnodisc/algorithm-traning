package com.jmlim.interview.annotation;

import java.util.List;

public class ProductListsCompareTester implements ProductTester {
	private List<Product> firstSearchResult;
	private List<Product> secondSearchResult;

	private boolean isPassed = true;

	public ProductListsCompareTester() {
		initTestData();
	}

	private void initTestData() {
		// 검색을 해서List<Product>에 셋팅
		System.out.println("ProductListsCompareTester : 첫번째 리스트 검색 후 SET");
		System.out.println("ProductListsCompareTester : 두번째 리스트 검색 후 SET");
	}

	@MyTest
	public boolean compareTest() {
		System.out.println("ProductListsCompareTester 테스트 수행");
		// 테스트 수행 후 isPassed에 결과 setting
		return isPassed;
	}
}
