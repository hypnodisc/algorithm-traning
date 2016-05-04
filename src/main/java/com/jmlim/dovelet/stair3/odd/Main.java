package com.jmlim.dovelet.stair3.odd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int sum = (1 + n) * (n / 2);
		//if (n % 2 == 1) {
		//	sum += (1 + n) / 2;
		//}
		System.out.print(n * (n + 1) / 2);
	}
}
