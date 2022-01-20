public class WhileLoop17 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please Enter an Integer Number");
			return;
		}

		int num = Integer.parseInt(args[0]);
		int rev = 0, orignal = num;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem ;
			num /= 10;
		}

		if (rev == orignal)
			System.out.println(orignal + " is a palindrome");
		else
			System.out.println(orignal + " is not a palindrome");
	}
}
