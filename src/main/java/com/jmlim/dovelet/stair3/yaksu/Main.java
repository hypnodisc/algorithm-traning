package com.jmlim.dovelet.stair3.yaksu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i <= in1; i++) {
			if (in1 % i == 0) {
				cnt++;
				if (cnt == in2) {
					System.out.print(i);
					return;
				}
			}
		}
		System.out.print(0);
	}
}
