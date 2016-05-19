package com.jmlim.dovelet.stair3.square;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), i = 1;
		int sum = 0, min = Integer.MAX_VALUE;
		while (i * i < m) {
			i++;
		}
		while (i * i <= n) {
			sum += i * i;
			if (min > i * i)
				min = i * i;
			i++;
		}
		if (sum != 0) {
			System.out.printf("%d\n%d", sum, min);
		} else {
			System.out.print(-1);
		}
	}
}
