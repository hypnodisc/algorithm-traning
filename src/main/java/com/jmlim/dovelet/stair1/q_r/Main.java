package com.jmlim.dovelet.stair1.q_r;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt(), ip2 = sc.nextInt();
		System.out.printf("%d %d", ip1 / ip2, ip1 % ip2);
	}
}
