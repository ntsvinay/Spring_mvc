package testing;

public class MainI implements A, A2 {

	@Override
	public int abc(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abc(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String abc1(int a, int b) {
		// TODO Auto-generated method stub
		return A.super.abc1(a, b);
	}

	public static void main(String[] args) {
		A2 a = new MainI();
		System.out.println(a.abc1(10, 12));
	}
}
