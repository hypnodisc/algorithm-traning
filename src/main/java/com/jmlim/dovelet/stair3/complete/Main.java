package com.jmlim.dovelet.stair3.complete;

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
		out.printf("%s", sum == input ? "yes" : "no");
	}
}
