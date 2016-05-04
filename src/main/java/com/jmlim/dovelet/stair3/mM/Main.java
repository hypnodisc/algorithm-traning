package com.jmlim.dovelet.stair3.mM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE, max = 0;
		for (int i = 0; i < 7; i++) {
			int input = sc.nextInt();
			if (min >= input) {
				min = input;
			}
			if (max <= input) {
				max = input;
			}
		}
		System.out.printf("%d %d", max, min);
	}
}
