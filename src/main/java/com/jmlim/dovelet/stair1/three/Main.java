package com.jmlim.dovelet.stair1.three;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt(), ip2 = sc.nextInt(), one, two, three;
		one = ip2 % 10 * ip1;
		two = ip2 % 100 / 10 * ip1;
		three = ip2 % 1000 / 100 * ip1;
		System.out.printf("%d\n%d\n%d\n%d", one, two, three, one + two * 10 + three * 100);
	}
}
