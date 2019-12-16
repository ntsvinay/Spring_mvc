package testing;

import org.hibernate.annotations.Check;

public class TryCatchReturn {
	public static void main(String[] args) {
		try {
			System.out.println(check(12));

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}

	}

	public static String check(int a) {
		try {
			if (a < 18)
				throw new ArithmeticException("not allowed");
			else
				return "able to vote";
		} catch (Exception e) {
			return "from catch";
		} finally {
			return "from finally";
		}

	}

}
