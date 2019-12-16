package testing;

public interface A {
	public int abc(Integer a, Integer b);

	default String abc1(int a, int b) {
		return a + b + "--:A";
	}

}
