interface IFactorial {
	int factorial(int n);
}

public class MethodReference01 {

	public int factorial(int n) {
		int fact = 1;
		while (n > 1) {
			fact *= n;
			n--;
		}

		return fact;
	}

	public static void main(String[] args) {
		IFactorial f = new MethodReference01()::factorial;
		System.out.println(f.factorial(5));
	}
}
