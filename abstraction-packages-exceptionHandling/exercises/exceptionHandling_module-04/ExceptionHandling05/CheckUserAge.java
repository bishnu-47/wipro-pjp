
public class CheckUserAge {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Pass Name and Age as agrs.");
			return;
		}

		try {
			String name = args[0];
			int age = Integer.parseInt(args[1]);

			if (age < 18 || age > 60) {
				throw new InvalidAgeException("Your age should be 18 to 60.");
			}

			System.out.println("Congrats " + name + ", you are eligible for this program.");
		} catch (InvalidAgeException iae) {
			System.out.println(iae);
		}
	}
}
