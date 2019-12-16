package testing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateOfAnArray {
	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 6, 3, 2, 1 };
		int[] aa = { 1, 4, 5, 7, 5 };
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= aa.length - 1; j++) {
				if (a[i] == aa[j]) {
					s.add(a[i]);

				}
			}
		}
		for (int aaa : s) {

			System.out.println(aaa);
		}
	}
}
