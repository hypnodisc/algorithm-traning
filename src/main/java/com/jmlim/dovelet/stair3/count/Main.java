package com.jmlim.dovelet.stair3.count;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(), x, y, i, c;
		x = y = i = c = 0;
		loop: for (;; i++) {
			for (int j = 1; j <= i; j++) {
				++c;
				// System.out.printf("%d %d %d %d\n", j, i - j + 1, c, i);
				if (c >= count) {
					if (i % 2 == 1) {
						x = i - j + 1;
						y = j;
					} else {
						x = j;
						y = i - j + 1;
					}
					break loop;
				}
			}
		}
		System.out.printf("%d IS %d/%d", count, x, y);
	}
}
