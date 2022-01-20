public class IfStatement1B {

	public static boolean lastDigit(int a, int b) {
		return a % 10 == b % 10;
	}

	public static void main(String[] args) {
		int a = 232, b = 92;
		System.out.println(lastDigit(a, b));
	}
}
