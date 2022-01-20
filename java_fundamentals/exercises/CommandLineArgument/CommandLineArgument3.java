public class CommandLineArgument3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
}
