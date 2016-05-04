package com.jmlim.dovelet.stair3.validate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			input = (int) Math.pow(input, 2);
			sum = (sum + input) % 10;
		}
		System.out.print(sum);
	}
}
