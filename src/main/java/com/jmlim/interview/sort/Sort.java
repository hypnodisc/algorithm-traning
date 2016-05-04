package com.jmlim.interview.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Sort {

	@Test
	public void bubble() {
		// for i between 0 and (array length -2 ):
		// if(array(i+1) < array(i)):
		// switch array(i) and array(i+1)
		// repeat until a complete interation where no elements are switched.

		// 설명과 구현이 가장 쉬운 알고리즘.
		// 두 인접한 원소를 검사하여 정렬하는 방법.
		final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		// 4,7,1,6,3,5,4; 0,1
		// 4,1,7,6,3,5,4; 1,2
		// 4,1,6,7,3,5,4; 2,3
		// 4,1,6,3,7,5,4; 3,4
		// 4,1,6,3,5,7,4; 4,5
		// 4,1,6,3,5,4,7; 5,6

		// 1,4,6,3,5,4,7; 0,1
		// 1,4,6,3,5,4,7; 1,2
		// 1,4,3,6,5,4,7; 2,3
		// 1,4,3,5,6,4,7; 3,4
		// 1,4,3,5,4,6,7; 4,5

		// 1,4,3,5,4,6,7; 0,1
		// 1,3,4,5,4,6,7; 1,2
		// 1,3,4,5,4,6,7; 2,3
		// 1,3,4,4,5,6,7; 3,4

		Integer[] numArray = (Integer[]) numbers.toArray();

		for (int i = 0; i < numArray.length; i++) {
			for (int j = i; j < numArray.length - 1; j++) {
				if (numArray[j] < numArray[j + 1]) {
					// 내림차순
					int temp = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = temp;
					// System.out.println(i + " " + j + " " + numArray[j] + " "
					// + numArray[j + 1]);
				}
			}
		}

		for (Integer num : numArray) {
			System.out.println(num);
		}
		System.out.println();
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length - i - 1; j++) {
				// 오름차순
				if (numArray[j] > numArray[j + 1]) {
					int temp = numArray[j + 1];
					numArray[j + 1] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		for (Integer num : numArray) {
			System.out.println(num);
		}
	}

	// k번째 원소를 1~k-1까지와 비교해 적절한 위치에 끼워넣고 그 뒤의 자료를 한 칸씩 뒤로 밀어내는 방식으로, 평균적으론
	// O(n2)중 빠른편이나[12] 자료구조에 따라선 뒤로 밀어내는데 걸리는 시간이 크며,
	// 앞의 예시처럼 작은게 뒤쪽에
	// 몰려있으면(내림차순의 경우 큰게 뒤쪽에 몰려있으면) 그야말로 헬게이트다.
	// 다만 이미 정렬되어 있는 자료구조에 자료를 하나씩 삽입/제거하는 경우에는, 현실적으로 최고의 정렬 알고리즘이 되는데 탐색을 제외한
	// 오버헤드가 매우 적기 때문이다. 괜히 '삽입'이란 이름이 붙은 것이 아니다.
	@Test
	public void insert() {
		final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		final List<Integer> sortedList = new ArrayList<>();
		// Integer[] numArray = (Integer[]) numbers.toArray();

		// 4,7,1,6,3,5,4
		// 4,7,1,6,3,5,4
		// 1,4,7,6,3,5,4
		// 1,4,6,7,3,5,4
		// 1,3,4,6,7,5,4
		// 1,3,4,5,6,7,4
		// 1,3,4,4,5,6,7

		// 다시 짜볼것.
		originalList: for (Integer number : numbers) {
			for (int i = 0; i < sortedList.size(); i++) {
				if (number < sortedList.get(i)) {
					sortedList.add(i, number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}
		System.out.println(sortedList);
	}

	// 리스트는 특정 타입 값들이 순차적으로 정렬된 컬렉션이다. 자바에서는 LinkedList나 ArrayList 클래스를 일반적으로
	// 사용한다.

	// 리스트는 자바의 내장 컬렉션인 배열하고는 다르다. 사실 리스트는 크기 지정에 한계가 없으므로 리스트를 사용하기 전에 크기를 지정할
	// 필요가 없다.

}
