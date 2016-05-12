package com.jmlim.dovelet.stair1.sec;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.printf("%d %d %d %d", input / 86400, (input / 3600) % 24, (input / 60) % 60, input % 60);
	}
}
