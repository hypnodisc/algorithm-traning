package test;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputLength = sc.nextInt();
		int[][] arr = new int[inputLength][inputLength];

		int max = inputLength;
		int cnt, row, column;
		cnt = row = 0;
		column = -1;

		int addNum = 1;
		while (max != 0) {
			// max 5
			// max 4
			for (int i = 0; i < max; i++) {
				cnt++;
				column += addNum;
				arr[row][column] = cnt;
			}
			max--;
			// max 4
			// max 3
			// ...
			for (int i = 0; i < max; i++) {
				cnt++;
				row += addNum;
				arr[row][column] = cnt;
			}

			addNum = addNum * -1;
		}

		for (int i = 0; i < inputLength; i++) {
			for (int j = 0; j < inputLength; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
