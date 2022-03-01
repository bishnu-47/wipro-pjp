interface ICheckPrime {
	void prime(int n);
}

public class MethodReference03 {

	public MethodReference03(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("prime");
		} else {
			System.out.println("Not Prime");
		}
	}

	public static void main(String[] args) {
		ICheckPrime cp = MethodReference03::new;
		cp.prime(17);
	}
}
