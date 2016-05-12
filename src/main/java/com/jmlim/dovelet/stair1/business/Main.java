package com.jmlim.dovelet.stair1.business;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), P = sc.nextInt(), C = sc.nextInt(), sum;
		// sum = M + C - P - C - N;
		// sum = -1 * (M - P - N);
		sum = -M + P + N;
		System.out.println(sum);
	}
}
