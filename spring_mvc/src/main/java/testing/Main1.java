package testing;

class Main1 {
	static {

		System.out.println("from static block");
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("from maoin");
		Main2 m = Main2.getOb();
		System.out.println(m);
		Main2 m1 = Main2.getOb();
		System.out.println(m1);
		if (m.equals(m1)) {
			System.out.println("jhgcuias");
		}
	}

}

class Main2 {
	private static Main2 ob = null;

	private Main2() {

	}

	public static Main2 getOb() {
		if (ob == null)
			ob = new Main2();
		return ob;
	}
}