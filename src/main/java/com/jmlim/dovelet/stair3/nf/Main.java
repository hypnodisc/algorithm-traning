package com.jmlim.dovelet.stair3.nf;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				cnt++;
			}
		}
		System.out.println(cnt % 2 == 1 ? "yes" : "no");
	}
}
