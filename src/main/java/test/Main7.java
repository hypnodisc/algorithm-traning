package test;

public class Main7 {
	public static void main(String[] args) {
		int[] arr = { 44, 2, 1, 60, 3, 2, 6, 66, 4, 7, 8, 9, 3, 2, 6, 1 };

		for (int i = 1; i < arr.length; i++) {
			// 비교기준
			int standard = arr[i];
			// 비교대상 키
			int aux = i - 1;

			while (aux >= 0 && standard < arr[aux]) {
				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = standard;
		}

		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
	}
}
