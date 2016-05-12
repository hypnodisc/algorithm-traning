package com.jmlim.dovelet.stair1.koi_watch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hh = sc.nextInt(), mi = sc.nextInt(), ss = sc.nextInt(), addSec = sc.nextInt();
		int allSec = hh * 3600 + mi * 60 + ss + addSec;
		System.out.printf("%d %d %d", (allSec / 3600) % 24, (allSec / 60) % 60, allSec % 60);
	}
}
