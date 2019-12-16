package testing;

public class ReverseInteger {
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		ri.armstronge();

	}

	public void intReverse() {
		int a = 414;
		int a_value = a;
		int ab = 0;
		int abc = 0;
		while (a > 0) {
			abc = a % 10;
			ab = ab * 10 + abc;
			a = a / 10;

		}
		if (a_value == ab)

			System.out.println(ab + "-palinidrom number");
		else
			System.out.println(ab + "-not palindrom number");

	}

	public void armstronge() {
		int aa = 153;
		int a2 = aa;
		int a = 0;
		int sa = 0;
		while (aa > 0) {
			a = aa % 10;
			sa = sa + (a * a * a);
			aa = aa / 10;

		}
		if (a2 == sa)
			System.out.println(a2 + "-is armstronge number");
		else
			System.out.println(a2 + "-is not armstronge number");

	}
}
