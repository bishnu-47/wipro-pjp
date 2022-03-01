import java.util.ArrayList;

public class LambdaExpressions01 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 1; i <= 25; i++) {
			int random = (int) (Math.random() * 100);
			al.add(random);
		}

		al.forEach(no -> {
			if (isPrime(no)) {
				System.out.println(no);
			}
		});
	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}

		return !(c > 2);
	}
}
