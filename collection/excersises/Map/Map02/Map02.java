
public class Map02 {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();

		pb.addContact("Ram", "9876543212");
		pb.addContact("Avinash", "9999988888");
		pb.addContact("Zoya", "6655443322");

		System.out.println(pb.getNumber("Avinash"));
		System.out.println(pb.getName("6655443322"));
		pb.printContacts();
	}
}
