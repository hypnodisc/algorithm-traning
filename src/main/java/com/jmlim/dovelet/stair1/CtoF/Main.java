package com.jmlim.dovelet.stair1.CtoF;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		System.out.printf("%.1f", (double) 9 / 5 * c + 32);
	}
}
