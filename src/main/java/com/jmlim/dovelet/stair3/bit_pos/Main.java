package com.jmlim.dovelet.stair3.bit_pos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bStr = Integer.toBinaryString(sc.nextInt());
		for (int i = bStr.length() - 1, j = 0; i >= 0; i--, j++) {
			if ('1' == bStr.charAt(i)) {
				System.out.printf("%d ", j);
			}
		}
	}
}