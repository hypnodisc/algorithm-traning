package com.jmlim.dovelet.stair1.coci_slatkisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		b = (int) Math.pow(10, b);
		System.out.println(Math.round((double)a / b) * b);
	}
}
