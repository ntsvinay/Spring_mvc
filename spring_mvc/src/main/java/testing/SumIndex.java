package testing;

import java.util.HashMap;
import java.util.Map;

public class SumIndex {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 5 };
		int trgt = 4;
		int aa[] = check(a, trgt);

		System.out.println(aa[0] + "" + aa[1]);
	}

	public static int[] check(int a[], int trgt) {

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i <= a.length; i++) {

			int ex = trgt - a[i];

			if (m.containsKey(ex)) {

				return new int[] { i, m.get(ex) };

			}
			m.put(a[i], i);
		}
		return new int[] { 0, 0 };

	}

}
