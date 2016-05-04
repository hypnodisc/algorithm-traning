package com.jmlim.dovelet.stair3.adigit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1, sum10, sum100;
		sum1 = sum10 = sum100 = 0;
		for (int i = 0; i < 7; i++) {
			int input = sc.nextInt();
			if (input < 10) {
				sum1 += input;
			} else if (input >= 10 && input < 100) {
				sum10 += input;
			} else {
				sum100 += input;
			}
		}
		System.out.printf("%d %d %d", sum1, sum10, sum100);
	}
}
