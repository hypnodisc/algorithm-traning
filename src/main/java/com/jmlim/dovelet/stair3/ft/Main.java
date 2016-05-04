package com.jmlim.dovelet.stair3.ft;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), cnt, sum, digit = 1;
		cnt = sum = 0;

		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				out.printf("%d ", i);
				cnt++;
				sum += i;
				digit = (digit % 10) * i;
			}
		}

		out.printf("\n%d", cnt);
		out.printf("\n%d", sum);
		out.printf("\n%d", digit % 10);
	}
}
