package com.jmlim.dovelet.stair3.financial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
