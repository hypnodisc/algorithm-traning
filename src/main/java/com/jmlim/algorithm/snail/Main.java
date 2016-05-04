package com.jmlim.algorithm.snail;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] snail = new int[input][input];

		int count, row, column = -1, max = input, addVal = 1;
		count = row = 0;

		// max 5일경우 5,4,4,3,3,2,2,1,1
		while (max != 0) {
			// column
			for (int i = 0; i < max; i++) {
				column += addVal;
				snail[row][column] = ++count;
			}
			max--;
			// row
			for (int i = 0; i < max; i++) {
				row += addVal;
				snail[row][column] = ++count;
			}

			// 돌고 빠지고
			addVal = addVal * -1;
		}
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.printf("%d\t", snail[i][j]);
			}
			System.out.println();
		}
	}
}
