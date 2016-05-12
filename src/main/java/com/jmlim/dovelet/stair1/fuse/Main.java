package com.jmlim.dovelet.stair1.fuse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double computer = sc.nextInt(), printer = sc.nextInt(), router = sc.nextInt();
		computer = (1.5 + 1.0) * computer;
		printer = 2.0 * printer;
		router = 0.5 * router;
		System.out.printf("%d amperes", (int) ((computer + printer + router) * 2 + 9) / 10 * 10);
	}
}
