package com.jmlim.interview.maxnumber;

import java.util.Arrays;

/*
 * 
 * 음수가 아닌 수들이 주어졌을 때 그 수들을 이어서 만들 수 있는 가장 큰 수를 구하시오.
 *  예를 들어 [1,2,3]이 주어졌을 때 만들 수 있는 가장 큰 수는 321이고, 
 *  [3, 30, 34, 5, 9] 가 주어지면 만들 수 있는 가장 큰 수는 9534330이다.
 * */
public class MakeNumber {
	public static Integer makeLargestNumber(Integer... numbers) {
		StringBuilder builder = new StringBuilder();
		Arrays.sort(numbers, (o1, o2) -> {
			return o2.toString().compareTo(o1.toString());
		});

		for (int i = 0; i < numbers.length; i++) {
			builder.append(numbers[i]);
		}

		return Integer.parseInt(builder.toString());
	}

	public static void main(String[] args) {
		System.out.println(makeLargestNumber(3, 30, 34, 5, 9));
	}
}
