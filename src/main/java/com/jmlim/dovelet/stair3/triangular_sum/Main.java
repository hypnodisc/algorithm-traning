package com.jmlim.dovelet.stair3.triangular_sum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), sum = 0, n;

		for (int i = 1; i <= input; i++) {
			n = i + 1;
			sum += i * (n * (n + 1) / 2);
		}
		System.out.print(sum);
	}
}
