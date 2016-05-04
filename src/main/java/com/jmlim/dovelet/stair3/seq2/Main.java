package com.jmlim.dovelet.stair3.seq2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), sum = 0;
		for (int i = 1; i <= input; i++) {
			System.out.printf("%d..%d %d\n", 1, i, sum += i);
		}
	}
}
