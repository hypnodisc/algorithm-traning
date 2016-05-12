package com.jmlim.dovelet.stair1.change;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), hundred, fifty, ten, money;
		money = 1000 - input;
		hundred = money / 100;
		money = money % 100;
		fifty = money / 50;
		money = money % 50;
		ten = money / 10;
		System.out.printf("%d %d %d", hundred, fifty, ten);
	}
}
