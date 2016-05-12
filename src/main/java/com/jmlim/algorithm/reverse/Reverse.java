package com.jmlim.algorithm.reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp = input;
		int reverse = 0;

		while (temp > 0) {
			reverse = (reverse * 10) + temp % 10;
			temp = temp / 10;
		}
		System.out.println(reverse);
	}
}
