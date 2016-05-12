package com.jmlim.dovelet.stair1.paintblock;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horizontal = sc.nextInt(), vertical = sc.nextInt(), height = sc.nextInt();
		// int sum = ((horizontal - 2) * 4) + ((vertical - 2) * 4) + ((height -
		// 2) * 4);
		int sum = (horizontal + vertical + height - 6) * 4;
		System.out.println(sum);
	}
}
