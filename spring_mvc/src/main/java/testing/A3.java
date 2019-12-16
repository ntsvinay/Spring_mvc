package testing;

public interface A3 extends A, A2 {

	@Override
	default String abc1(int a, int b) {
		// TODO Auto-generated method stub
		return A2.super.abc1(a, b);
	}

}
