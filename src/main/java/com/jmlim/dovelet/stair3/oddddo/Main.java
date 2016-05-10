package com.jmlim.dovelet.stair3.oddddo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), sum = 0;
		for (int k = 1, n = input; k <= input; k++, n--) {
			sum = sum + (2 * k - 1) * (2 * n - 1);
		}
		System.out.println(sum);
	}
}
