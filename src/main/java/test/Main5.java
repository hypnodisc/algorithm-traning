package test;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 44, 2, 1, 60, 3, 2, 6, 66, 4, 7, 8, 9, 3, 2, 6, 1 };
		// 2 44 , 0 1
		// 1 2 44 , 0,2
		// 1,2,44,60,
		// 1,2,44,60,
		// 1,2,3,44,60 2,

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j >= 1; j--) {
				// System.out.print(j + " ");
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
