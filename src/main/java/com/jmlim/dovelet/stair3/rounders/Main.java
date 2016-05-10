package com.jmlim.dovelet.stair3.rounders;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num = input;
		int cnt = -1;
		while (input > 0) {
			input = input / 10;
			cnt++;
		}
		for (int i = 0; i < cnt; i++) {
			num = (int) Math.round((double) num / 10);
		}
		System.out.println((int) Math.pow(10, cnt) * num);
	}
}
