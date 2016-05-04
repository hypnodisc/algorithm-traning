package test;

import org.junit.Test;

public class Study {

	@Test
	public void bubbleSort() {
		int[] arr = { 6, 1, 2, 7, 2, 8, 4, 99, 233, 88, 5 };

		// 6,1,2,7,2,8,4,.....
		// 1,6,2,7,2,8,4,.....
		// 1,2,6,7,2,8,4,.....
		// 1,2,6,7,2,8,4,.....
		// 1,2,6,2,7,8,4,.....
		// .....
		// 1,2,6,2,7,4,8,......

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int num : arr) {
			// System.out.print(num + " ");
		}
	}

	@Test
	public void 달팽이() {
		/*
		 * Scanner input = new Scanner(System.in); int length = input.nextInt();
		 * 
		 * int[] arr = new int[length * length];
		 * 
		 * int index = 0; // 0,1,2,3,4, // 9,14,19,24 // 23,22,21,20 // 15,10,5
		 * // 6,7,8, // 13,18 // 17,16 // 11,12
		 * 
		 * int l2 = length * length; for (int i = 0; i < l2; i++) {
		 * 
		 * if (i > length - 1) { index = index + 5; if (index >= (l2) - 1) {
		 * index--; } }
		 * 
		 * index++; }
		 * 
		 * for (int i = 0; i < length; i++) { for (int j = 0; j < length; j++) {
		 * arr[index] = index; // System.out.print((++index) + "\t"); index++; }
		 * // System.out.println(); }
		 * 
		 * index = 0; for (int i = 0; i < length; i++) { for (int j = 0; j <
		 * length; j++) { System.out.print(arr[index] + " \t"); index++; }
		 * System.out.println(); }
		 */
	}

	@Test
	public void snail() {
		int r = 0, c = -1, sw = 1, f = 5, n = 0;
		int[][] d = new int[5][5];

		while (f != 0) {
			for (int i = 0; i < f; i++) {
				c += sw;
				n++;
				d[r][c] = n;
			}
			f--;
			for (int i = 0; i < f; i++) {
				r += sw;
				n++;
				d[r][c] = n;
			}
			sw *= -1;
		}
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void 피보나치() {
		
	}
	
	
	@Test
	public void snailPractice() {
		
	}
	
}
