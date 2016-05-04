package com.jmlim.interview.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationTester {

	private List<ProductTester> testLists = new ArrayList<>();
	private boolean isAllPassed = false;

	public void addTester(ProductTester tester) {
		this.testLists.add(tester);
	}

	public boolean isAllPassed() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		for (ProductTester tester : testLists) {
			Class<?> clazz = tester.getClass(); // 1. 클래스 객체를 얻는다.
			Method[] methods = clazz.getMethods(); // 2. 메서드들을 얻는다

			System.out.println("clazz: " + clazz.getSimpleName());

			for (Method method : methods) {
				// 3. 2에서 얻은 메서드들을 탐색하면서 MyTest.class 어노테이션을 가져온다.
				Annotation annotation = method.getAnnotation(MyTest.class);
				// 어노테이션이 있으면
				if (annotation != null) {
					System.out.println("method : " + method);
					// 5. 그 메소드를 실행.
					method.invoke(tester, null);
				}
			}
		}
		return isAllPassed;
	}
}
