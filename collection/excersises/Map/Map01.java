import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map01 {
	Map<String, String> mapObj = new HashMap<>();

	public String saveCountryCapital(String country, String capital) {
		return mapObj.put(country, capital);
	}

	public String getCapital(String country) {
		if (!mapObj.containsKey(country)) {
			return "No Country Found!";
		} else {
			return "Capital of " + country + " is " + mapObj.get(country);
		}
	}

	public String getCountry(String capital) {
		if (!mapObj.containsValue(capital)) {
			return "No Capital Found!";
		} else {
			for (Entry<String, String> entry : mapObj.entrySet()) {
				if (entry.getValue().equals(capital)) {
					return capital + " is capital of " + entry.getKey();
				}
			}
		}

		return null;
	}

	public HashMap<String, String> switchKeyValue() {
		Map<String, String> mapObj2 = new HashMap<String, String>();
		for (Entry<String, String> entry : mapObj.entrySet()) {
			mapObj2.put(entry.getValue(), entry.getKey());
		}

		return (HashMap<String, String>) mapObj2;
	}

	public ArrayList<String> contryToArrayList() {
		List<String> list = new ArrayList<String>();
		for (Entry<String, String> entry : mapObj.entrySet()) {
			list.add(entry.getKey());
		}

		return (ArrayList<String>) list;
	}

	public ArrayList<String> capitalToArrayList() {
		List<String> list = new ArrayList<String>();
		for (Entry<String, String> entry : mapObj.entrySet()) {
			list.add(entry.getValue());
		}

		return (ArrayList<String>) list;
	}

	public static void printHashMap(HashMap<String, String> map) {
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void printArrayList(ArrayList<String> list) {
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Map01 obj = new Map01();

		System.out.println("Adding country and capital");
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Bangladesh", "Dakha");
		obj.saveCountryCapital("Japan", "Tokyo");

		System.out.println();
		System.out.println(obj.getCapital("Japan"));
		System.out.println(obj.getCountry("Delhi"));

		System.out.println();
		HashMap<String, String> swaped = obj.switchKeyValue();
		System.out.println("Swapped Country & capital");
		printHashMap(swaped);

		System.out.println();
		ArrayList<String> list;
		list = obj.contryToArrayList();
		System.out.println("List of countries");
		printArrayList(list);

		System.out.println();
		list = obj.capitalToArrayList();
		System.out.println("List of capitals");
		printArrayList(list);
	}

}
