package com.jmlim.dovelet.stair3.oneton1;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), sum = 0;
		for (int i = 1; i <= input; i++) {
			if (i > 1) {
				out.print("+");
			}
			out.print(i);
			sum += i;
		}
		out.printf("=%d", sum);
	}
}
