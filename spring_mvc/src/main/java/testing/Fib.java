package testing;

public class Fib {

	static {
		System.out.println("fibonacci series");
	}
	{
		System.out.println("init");
	}

	int abc(int n) {

		if (n == 0) {
			return 0;
		}

		else if (n == 1 || n == 2) {
			return 1;
		}
		return abc(n - 2) + abc(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main");
		int a = 5;
		for (int i = 0; i < a; i++) {
			System.out.print(new Fib().abc(i));

		}
	}
}
