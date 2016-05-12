package com.jmlim.dovelet.stair1.triangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt(), ip2 = sc.nextInt();
		System.out.printf("%.2f", (double) ip1 * ip2 / 2);
	}
}
