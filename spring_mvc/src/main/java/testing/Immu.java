package testing;

public final class Immu {

	private final String name;
	private final int id;

	public String getName(String name) {
		name = this.name;
		return name;
	}

	public int getName(int id) {
		id = this.id;
		return id;
	}

	public Immu(String name, int id) {
		this.id = id;
		this.name = name;
	}

}
