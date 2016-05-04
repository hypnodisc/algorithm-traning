package com.jmlim.dovelet.stair3.min;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 7; i++) {
			int input = sc.nextInt();
			if (min >= input) {
				min = input;
			}
		}
		System.out.print(min);
	}
}
