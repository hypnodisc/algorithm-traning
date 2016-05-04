package com.jmlim.dovelet.stair3.threenp1;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (input != 1) {
			out.printf("%d ", input);
			input = input % 2 == 0 ? input / 2 : input * 3 + 1;
		}
		out.printf("%d ", input);
	}
}
