package testing;

public class ArrSort {
	public static void main(String[] args) {
		int[] aaa = { 1, 8, 2, 3, 4, 4, 4, 2, 3 };
		int temp = 0;
		for (int i = 1; i < aaa.length; i++) {

			if (aaa[i] < aaa[i - 1]) {

				aaa[i] = aaa[i] + aaa[i - 1];
				aaa[i - 1] = aaa[i] - aaa[i - 1];
				aaa[i] = aaa[i] - aaa[i - 1];
				i = 0;
			}
			
		}
		for (int a : aaa) {
			System.out.println(a);
		}

	}

}
