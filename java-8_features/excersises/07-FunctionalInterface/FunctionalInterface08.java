import java.util.ArrayList;
import java.util.function.Supplier;

public class FunctionalInterface08 {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Supplier<ArrayList<Integer>> s1 = () -> {
			ArrayList<Integer> list = new ArrayList<>();
			int count = 0;

			for (int i = 0; count < 10; i++) {
				if (isPrime(i)) {
					list.add(i);
					count++;
				}
			}
			return list;
		};

		ArrayList<Integer> primes = s1.get();
		primes	.stream()
				.forEach(System.out::println);
	}
}
