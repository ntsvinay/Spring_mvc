package testing;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 32, 34, 4 };

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] < arr[i - 1]) {

				arr[i] = arr[i] + arr[i - 1];
				arr[i - 1] = arr[i] - arr[i - 1];
				arr[i] = arr[i] - arr[i - 1];
				i = 0;
			}

			/*
			 * int temp = 0; for (int j = i; j <= arr.length - 1; j++) { if (arr[i] >
			 * arr[j]) { temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
			 * 
			 * }
			 * 
			 * }
			 */

		}
		// System.out.println(arr[3]);

		for (int a : arr) {

			System.out.println(a);
		}
	}

}
