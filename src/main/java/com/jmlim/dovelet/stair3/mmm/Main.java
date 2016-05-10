package com.jmlim.dovelet.stair3.mmm;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum, max, min = Integer.MAX_VALUE;
		sum = max = 0;
		for (int i = 1; i <= 10; i++) {
			int input = sc.nextInt();
			sum = sum + input;
			if (input > max)
				max = input;
			if (input < min)
				min = input;
		}
		out.printf("%d %d %d", sum, max, min);
	}
}
