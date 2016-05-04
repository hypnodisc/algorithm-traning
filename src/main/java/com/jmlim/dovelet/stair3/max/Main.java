package com.jmlim.dovelet.stair3.max;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (int i = 0; i < 7; i++) {
			int input = sc.nextInt();
			if (max <= input) {
				max = input;
			}
		}
		System.out.print(max);
	}
}
