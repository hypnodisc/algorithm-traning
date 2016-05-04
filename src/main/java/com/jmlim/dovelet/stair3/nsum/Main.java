package com.jmlim.dovelet.stair3.nsum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int n = 0;
		for (n = 0; ; n++) {
			if (n * (n + 1) / 2 == sum) {
				break;
			}
		}
		System.out.println(n);
	}
}
