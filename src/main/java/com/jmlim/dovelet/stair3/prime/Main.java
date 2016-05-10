package com.jmlim.dovelet.stair3.prime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int length = (int) Math.sqrt(input);
		String prime = "prime";
		for (int i = 2; i <= length; i++) {
			if (input % i == 0) {
				prime = "not prime";
				break;
			}
		}
		System.out.print(prime);
	}
}
