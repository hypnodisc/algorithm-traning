package com.jmlim.dovelet.stair3.perfect;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), sum = 0;

		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				sum += i;
			}
		}
		if (sum > input) {
			out.printf("%5d  %s", input, "ABUNDANT");
		} else if (sum < input) {
			out.printf("%5d  %s", input, "DEFICIENT");
		} else {
			out.printf("%5d  %s", input, "PERFECT");
		}
	}
}
