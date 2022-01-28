
public class UserRegistration {
	public void userRegister(String userName, String userCountry) throws InvalidCountryException {
		if (!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User Outside India cannot Register.");
		} else {
			System.out.println("User Registration done successfully");
		}
	}

	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();

		try {
			ur.userRegister("Ramesh", "India");
			ur.userRegister("Jimmy", "USA");

		} catch (InvalidCountryException ice) {
			System.out.println(ice);
		}
	}
}
