package com.jmlim.dovelet.stair3.steps;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), sum = 0;
		boolean check = false;
		if (x % 2 == 0) {
			sum = x + y;
			if ((sum / 2) % 2 != 0 && x - y == 2) {
				check = true;
			} else if ((sum / 2) % 2 == 0 && x == y) {
				check = true;
			}
		} else {
			sum = x + y;
			if ((sum / 2) % 2 != 0 && x == y) {
				check = true;
				sum = sum - 1;
			} else if ((sum / 2) % 2 == 0 && x - y == 2) {
				check = true;
				sum = sum - 1;
			}
		}
		if (check) {
			System.out.println(sum);
		} else {
			System.out.println("No Number");
		}
	}
}
