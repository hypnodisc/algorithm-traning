package com.jmlim.algorithm.odd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] odd = new int[input][input];
		int cnt = 0;

		for (int i = 0; i < input; i++) {
			if (i < 3) {
				for (int j = 2 - i; j <= 2 + i; j++) {
					cnt = cnt + 1;
					odd[i][j] = cnt;
				}
			} else {
				for (int j = i - 2; j <= 6 - i; j++) {
					cnt = cnt + 1;
					odd[i][j] = cnt;
				}
			}
		}
		// 0,2
		// 1,1
		// 1,2
		// 1,3
		// 2,0
		// 2,1
		// 2,2
		// 2,3
		// 2,4
		// 3,1
		// 3,2
		// 3,3
		// 4,2
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.printf("%d\t", odd[i][j]);
			}
			System.out.println();
		}
	}
}
