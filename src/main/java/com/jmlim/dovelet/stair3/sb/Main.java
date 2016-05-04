package com.jmlim.dovelet.stair3.sb;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mvIndex = 0, max = 0;
		for (int i = 1; i <= 7; i++) {
			int input = sc.nextInt();
			if (max <= input) {
				max = input;
				mvIndex = i;
			}
		}
		System.out.print(mvIndex);
	}
}
