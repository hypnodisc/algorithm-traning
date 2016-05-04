package com.jmlim.interview.annotation;

import java.util.List;

public class ProductRankScoreTester implements ProductTester {
	private List<Product> searchResult;

	private boolean isPassed = true;

	public ProductRankScoreTester() {
		initTestData();
	}

	private void initTestData() {
		// 검색을 해서List<Product>에 셋팅
		System.out.println("ProductRankScoreTester :  검색 후 SET");
	}

	@MyTest
	public boolean rankScoreTest() {
		System.out.println("ProductRankScoreTester 테스트 수행");
		// 테스트 수행 후 isPassed에 결과 setting
		return isPassed;
	}
}
