package testing;

import java.util.ArrayList;
import java.util.List;

public class LinkedDuplicate {
	public static boolean check(List<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			int val = a.get(i);
			a.remove(i);
			if (a.contains(val)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		System.out.println(check(l));
	}

}
