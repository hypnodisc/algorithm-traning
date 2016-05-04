package com.jmlim.dovelet.stair3.seq;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		if (start > end) {
			int temp = end;
			end = start;
			start = temp;
		}
		for (int i = start; i <= end; i++) {
			System.out.printf("%d ", i);
		}
	}
}
