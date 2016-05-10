package com.jmlim.dovelet.stair3.rprime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt(), ip2 = sc.nextInt(), mod;

		while (ip2 != 0) {
			mod = ip1 % ip2;
			ip1 = ip2;
			ip2 = mod;
		}
		System.out.print(ip1 == 1 ? "yes" : "no");
	}
}
