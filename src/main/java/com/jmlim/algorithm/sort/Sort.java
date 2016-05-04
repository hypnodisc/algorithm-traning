package com.jmlim.algorithm.sort;

public class Sort {
	public static Integer[] insertSort(Integer... numbers) {

		// 0
		// 555, 3, 32, 10, 22, 6, 1, 777, 33, 44
		// 1
		// 3, 555, 32, 10, 22, 6, 1, 777, 33, 44
		// 2
		// 3, 32, 555, 10, 22, 6, 1, 777, 33, 44
		// 3
		// 3, 10, 32, 555, 22, 6, 1, 777, 33, 44
		// 1 2 3

		for (int i = 1; i < numbers.length; i++) {
			// 비교기준
			int std = numbers[i];
			// 비교대상 키
			int key = i - 1;

			// 뒤로 밀기.
			while (key >= 0 && std < numbers[key]) {
				numbers[key + 1] = numbers[key];
				key--;
			}
			// 삽입
			numbers[key + 1] = std;
		}
		return numbers;
	}

	public static void main(String[] args) {
		Integer[] sortedNumbers = insertSort(555, 3, 32, 10, 22, 6, 1, 777, 33, 44);

		for (Integer number : sortedNumbers) {
			System.out.printf("%d ", number);
		}
	}
}
