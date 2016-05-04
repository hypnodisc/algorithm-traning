package com.jmlim.dovelet.stair3.rep;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.printf("%d ", i);
		}
	}
}
