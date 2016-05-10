package com.jmlim.dovelet.stair3.sc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), a, b, c, d, f, cnt;
		a = b = c = d = f = cnt = 0;
		while (input != -1) {
			switch (input / 10) {
			case 10:
			case 9:
				a++;
				break;
			case 8:
				b++;
				break;
			case 7:
				c++;
				break;
			case 6:
				d++;
				break;
			default:
				f++;
			}
			cnt++;
			input = sc.nextInt();
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", cnt, a, b, c, d, f);
	}
}
