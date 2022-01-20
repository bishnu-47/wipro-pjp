public class IfStatement6 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Please enter all arguments, Gender and Age");
			return;
		}

		String gender = args[0].toLowerCase();
		int age = Integer.parseInt(args[1]);

		// female
		if (gender.equals("female") && (age >= 1 && age <= 58 ))
			System.out.println("Percentage of intrest is 8.2%");
		else if (gender.equals("female") && (age >= 59 && age <= 100 ))
			System.out.println("Percentage of intrest is 9.2%");

		// male
		if (gender.equals("male") && (age >= 1 && age <= 58 ))
			System.out.println("Percentage of intrest is 8.4%");
		else if (gender.equals("male") && (age >= 59 && age <= 100 ))
			System.out.println("Percentage of intrest is 10.5%");
	}
}
