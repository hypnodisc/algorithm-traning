package test;

import java.util.Scanner;

public class Main4 {
	// (0), 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(f(input));
		
	}

	public static int f(int n) {
		System.out.println(n);
		if(n <= 2) {
			return n - 1;
		} else {
			return f(n-2) + f(n-1);
		}
	}
}
