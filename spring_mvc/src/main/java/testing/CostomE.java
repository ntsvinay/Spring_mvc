package testing;

public class CostomE {
	public static void main(String[] args) throws Costom {

		throw new Costom("abv");

	}

}

class Costom extends Exception {
	public Costom(String as) {
		super(as);

	}
}
