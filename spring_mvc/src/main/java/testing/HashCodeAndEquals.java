package testing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashCodeAndEquals {
	public static void main(String[] args) {
		HashMap<Abc, String> ma = new HashMap<Abc, String>();
		Abc a = new Abc(1);
		Abc a1 = new Abc(1);
		ma.put(a, "jadu1");
		ma.put(a1, "jadu");
		// Set se = ma.entrySet();
		System.out.println("size of an array--" + ma.size());
		Iterator it = ma.entrySet().iterator();
		System.out.println(ma.get(a1));
		System.out.println(ma.get(a));
		while (it.hasNext()) {
			Map.Entry<Abc, String> as = (Map.Entry<Abc, String>) it.next();
			System.out.println(as.getKey() + "-" + as.getValue().hashCode());
		}

	}
}

class Abc {
	int i;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abc other = (Abc) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public Abc(int i) {
		// TODO Auto-generated constructor stub
	}

}
