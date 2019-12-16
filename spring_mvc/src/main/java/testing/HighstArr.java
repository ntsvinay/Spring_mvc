package testing;

public class HighstArr {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 1 };
		int b[] = new int[a.length];
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {

				b[temp++] = a[i];
			}
		}
		b[temp++] = a[a.length - 1];
		for (int aa : b) {
			System.out.println(aa);
		}
	}

}
/*
 * for (int j = i + 1; j < a.length - 1; j++) { if (a[i] == a[j]) { a[i] = 0; }
 * 
 * }
 */