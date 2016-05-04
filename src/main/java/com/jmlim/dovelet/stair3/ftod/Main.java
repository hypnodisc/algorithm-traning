package com.jmlim.dovelet.stair3.ftod;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt(), ip2 = sc.nextInt();
		int pointCnt = sc.nextInt();

		int val = 0;
		int mod = ip1;
		StringBuilder builder = new StringBuilder();
		builder.append("0.");
		for (int i = 0; i < pointCnt; i++) {
			mod = mod * 10;
			if (mod > ip2) {
				val = mod / ip2;
				mod = mod % ip2;
				builder.append(val);
			} else {
				builder.append(0);
			}
		}
		System.out.println(builder.toString());
	}
}
