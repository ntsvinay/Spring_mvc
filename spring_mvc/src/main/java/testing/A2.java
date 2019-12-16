package testing;

public interface A2 {
	public int abc(int a, int b);

	default String abc1(int a, int b) {
		return a + b + "--from A2";
	}
}
