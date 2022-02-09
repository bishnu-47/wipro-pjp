import java.util.Map.Entry;
import java.util.TreeMap;

public class PhoneBook {
	private TreeMap<String, String> contactList = new TreeMap<>();

	public void addContact(String name, String number) {
		contactList.put(name, number);
	}

	public String getNumber(String name) {
		if (!contactList.containsKey(name)) {
			return "Contact Not Found!";
		}

		return contactList.get(name);
	}

	public String getName(String number) {
		if (!contactList.containsValue(number)) {
			return "Contact Not Found!";
		}

		for (Entry<String, String> entry : contactList.entrySet()) {
			if (entry.getValue().equals(number)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void printContacts() {
		for (Entry<String, String> entry : contactList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
