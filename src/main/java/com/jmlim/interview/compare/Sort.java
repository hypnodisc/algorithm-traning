package com.jmlim.interview.compare;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class Sort {

	/**
	 * 자바 기본. 1. Comparable와 Comparator 인터페이스의 차이는 무엇인가?
	 * 
	 * Comparable인터페이스는 자연스러운 순서로 정렬할 때 사용하고, Comparator는 원하는 대로 정렬 순서를 지정하고
	 * 싶은곳에 사용한다.
	 * 
	 * interview 관련
	 */
	@Test
	public void sortInts() {
		final int[] numbers = { -3, -5, 1, 7, 4, -2 };
		final int[] expected = { -5, -3, -2, 1, 4, 7 };

		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	// 객체 배열을 정렬하려면 코드 4-2 처럼 Comparable 인터페이스를 구현해야 한다.

	@Test
	public void sortObjects() {
		final String[] strings = { "z", "x", "y", "abc", "zzz", "zazzy" };
		final String[] expected = { "abc", "x", "y", "z", "zazzy", "zzz" };

		Arrays.sort(strings);
		assertArrayEquals(strings, expected);
	}

	/**
	 * String 클래스는 Comparable 인터페이스를 구현하므로 예상한 대로 정렬된다. 정렬해야 하는 타입이 Comparable
	 * 인터페이스를 구현하지 않으면 ClassCastException 예외가 발생한다. 따라서 클래스를 정의할 때는 코드 4-3 처럼
	 * Comparable 인터페이스를 구현해야 한다.
	 * 
	 */

	// Comparable 인터페이스 없이 정렬하기
	// @Test
	/*
	 * public void sortNotComparable() { final List<NotComparable> objects = new
	 * ArrayList<>();
	 * 
	 * for(int i = 0; i < 10; i++) { objects.add(new NotComparable()); }
	 * 
	 * try {
	 * 
	 * } catch(Exception e) {
	 * 
	 * }
	 * 
	 * fail(); }
	 */

	@Test
	public void sortTest() {
		List<Fruit> fruits = new ArrayList<>();

		fruits.add(new Fruit("Pineapple", 70));
		fruits.add(new Fruit("Apple", 30));
		fruits.add(new Fruit("Orange", 35));
		fruits.add(new Fruit("Banana", 50));

		Collections.sort(fruits, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				// TODO Auto-generated method stub

				System.out.println(o2.getName().compareToIgnoreCase(o1.getName()));
				return o2.getName().compareToIgnoreCase(o1.getName());
			}
		});

		for (Fruit fruit : fruits) {
			System.out.println(fruit.getName());
		}

		Collections.sort(fruits);

		for (Fruit fruit : fruits) {
			System.out.println(fruit.getName() + " " + fruit.getPrice());
		}
	}

	@Test
	public void numberSort() {
		final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);

		Collections.sort(numbers, new ReverseNumericalOrder());

		assertEquals(expected, numbers);
	}
	/**
	 * 
	 * 이 두개의 인터페이스의 차이점은 다음과 같다.
	 * 
	 * Comparable 와 Comparator 인터페이스는 객체를 비교하기 위한 인터페이스이다. 그렇다면 왜 이렇게 따로
	 * 존재하는것일까? 그 이유는 비교하는 기준에 따라서 틀리다. Comparable은 자기자신과 같은 클래스 타입의 다른객체와 비교하기
	 * 위해서 사용되고, Comparator 은 다른 두개의 객체를 비교.. 즉 Comparator 를 구현한 객체가 다른 두개의 객체를
	 * 비교하는 기준이 되어 두개의 객체를 비교한다. 주로 어떤 특정 객체에 대한 객체비교의 기준점을 제시할 때 쓰인다.
	 */
}
