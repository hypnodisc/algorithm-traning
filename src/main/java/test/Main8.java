package test;

public class Main8 {
	public static void main(String[] args) {

		// 1+2+3+4+.....+99+100
		// 100+1
		// 99+2
		// 98+3
		// 101
		int n = 100;
		if (n % 2 == 1) {
			System.out.println((1 + n - 1) * (n / 2) + n);
		} else {
			System.out.println((1 + n) * (n / 2));
		}

		System.out.println((n * (1 + n)) / 2);
	}
}
