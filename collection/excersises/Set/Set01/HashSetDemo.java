import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	HashSet<String> set = new HashSet<>();

	public boolean addCountry(String countryName) {
		return set.add(countryName);
	}

	public String findCountry(String countryName) {
		if (set.contains(countryName)) {
			return countryName;
		} else {
			return countryName + " Not Found";
		}
	}

	public void printAllCountries() {
		Iterator<?> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		HashSetDemo world = new HashSetDemo();

		world.addCountry("USA");
		world.addCountry("Russia");
		world.addCountry("India");
		world.addCountry("Nepal");
		world.addCountry("USA");

		System.out.println(world.findCountry("India"));
		System.out.println(world.findCountry("China"));

		System.out.println("All countries: ");
		world.printAllCountries();
	}
}
