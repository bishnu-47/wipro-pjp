
public class WrapperClasses02 {
	public static void main(String[] args) {
		if (args.length < 0) {
			System.out.println("Pass a value to continue.");
			return;
		}

		int no = Integer.parseInt(args[0]);

		System.out.println("Given number: " + no);
		System.out.println("Binary equivalent: " + Integer.toBinaryString(no));
		System.out.println("Octal equivalent: " + Integer.toOctalString(no));
		System.out.println("Hexadecimal equivalent: " + Integer.toHexString(no));
	}
}
