package testing;

import java.util.ArrayList;
import java.util.List;

public class SortedLiknedList {

	public void sortedArray() {
		int[] l = { 1, 2, 4, 6 };
		int[] l1 = { 1, 2, 4, 6 };
		int[] l2 = new int[l.length + l1.length];

		/*
		 * List<Integer> l = new ArrayList<Integer>(); l.add(1); l.add(2); l.add(4);
		 * l.add(5); List<Integer> l1 = new ArrayList<Integer>(); l1.add(1); l1.add(6);
		 * l1.add(9); l1.add(45); l1.add(78); List<Integer> l2 = new
		 * ArrayList<Integer>();
		 */
		int i = 0, j = 0, k = 0;
		while (i < l.length && j < l1.length) {
			if (l[i] < l1[j])
				l2[k++] = l[i++];
			else
				l2[k++] = l1[j++];

		}
		while (i < l.length) {
			l2[k++] = l[i++];
		}
		while (j < l1.length) {
			l2[k++] = l1[j++];
		}
		for (Integer a : l2) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(5);
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(6);
		l1.add(9);
		l1.add(45);
		l1.add(78);
		List<Integer> l2 = new ArrayList<Integer>();
		int i = 0, j = 0, k = 0;
		while (i < l.size() && j < l1.size()) {
			if (l.get(i++) < l1.indexOf(j++))
				l2.add(k++, l.get(i++));
			else
				l2.add(k++, l2.get(j++));

		}
		while (i < l.size()) {
			l2.add(k++, l.get(i++));
		}
		while (j < l.get(i++)) {
			l2.add(k++, l1.get(j++));
		}
		for (Integer a : l2) {
			System.out.println(a);
		}

	}
}
