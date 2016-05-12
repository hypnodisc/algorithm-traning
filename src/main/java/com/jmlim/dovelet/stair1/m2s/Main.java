package com.jmlim.dovelet.stair1.m2s;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.printf("%d minutes is %d seconds.", input, input * 60);
	}
}
