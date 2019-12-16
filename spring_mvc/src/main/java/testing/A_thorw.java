package testing;

public class A_thorw {

	public static void abc() {
		throw new Error();
	}

	public static void main(String[] args) {

		abc();

		try {
			System.out.println("dad");
		} catch (Exception e) {
			System.out.println("aaf");
		} finally {

			System.out.println("finally");
		}

	}
}

class B {

}
