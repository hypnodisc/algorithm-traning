package com.jmlim.dovelet.stair3.arith_seq;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), d = sc.nextInt(), an = sc.nextInt();
		int cnt = 0, num = a;
		if (an < 0) {
			while (num >= an) {
				num += d;
				cnt++;
			}
		} else {
			while (num <= an) {
				num += d;
				cnt++;
			}
		}
		num -= d;
		if (num == an) {
			System.out.print(cnt);
		} else {
			System.out.print("X");
		}
	}
	
	/*
	 * public static void main(String arg[]){ Scanner input = new
	 * Scanner(System.in);
	 * 
	 * int a = input.nextInt(); int d = input.nextInt(); int an =
	 * input.nextInt();
	 * 
	 * an -= a; if(an%d == 0) System.out.println(an/d+1); else
	 * System.out.println("X"); }
	 */
}
