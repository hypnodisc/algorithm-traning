package com.jmlim.dovelet.stair3.modular_inverse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int m = sc.nextInt();

		for (int n = 1; n <= m; n++) {
			if (x * n % m == 1) {
				System.out.print(n);
				return;
			}
		}
		System.out.print("No such integer exists.");
	}
}
