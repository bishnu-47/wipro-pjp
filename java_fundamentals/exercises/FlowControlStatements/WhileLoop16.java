public class WhileLoop16 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please Enter an Integer Number");
			return;
		}

		int num = Integer.parseInt(args[0]);
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem ;
			num /= 10;
		}

		System.out.println(rev);
	}
}
