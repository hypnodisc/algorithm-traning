package com.jmlim.dovelet.stair3.chemistry;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		double currentVal = sc.nextDouble();
		double prevVal = 0;
		double sum = 0;
		boolean existPrevVal = false;
		while (currentVal != 999) {
			sum = currentVal - prevVal;
			prevVal = currentVal;
			if (existPrevVal) {
				builder.append(String.format("%.2f\n", sum));
			}
			existPrevVal = true;
			currentVal = sc.nextDouble();
		}
		builder.append("End of Output");
		System.out.println(builder.toString());
	}
}
