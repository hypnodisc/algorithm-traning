package com.jmlim.dovelet.stair3.center1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int i, prevSum = 0, nextSum = 0;
		for (i = 1; i < input; i++) {
			prevSum += i;
		}

		while (prevSum > nextSum) {
			i++;
			nextSum += i;
		}

		System.out.printf("%s", prevSum == nextSum ? "O" : "X");
	}
}
