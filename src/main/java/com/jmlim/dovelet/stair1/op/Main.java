package com.jmlim.dovelet.stair1.op;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt(), ip2 = sc.nextInt();

		out.printf("%d+%d=%d\n", ip1, ip2, ip1 + ip2);
		out.printf("%d-%d=%d\n", ip1, ip2, ip1 - ip2);
		out.printf("%d*%d=%d\n", ip1, ip2, ip1 * ip2);
		out.printf("%d/%d=%d\n", ip1, ip2, ip1 / ip2);
		out.printf("%d%%%d=%d\n", ip1, ip2, ip1 % ip2);
	}
}
