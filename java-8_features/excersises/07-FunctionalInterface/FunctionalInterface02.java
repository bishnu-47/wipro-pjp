import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterface02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = Stream.iterate(1, n -> n + (int) (Math.random() * 10))
										.limit(10)
										.collect(Collectors.toCollection(ArrayList::new));

		list.forEach(System.out::println);

		Function<ArrayList<Integer>, Integer> fn = l -> {
			int sum = 0;
			for (int n : l) {
				sum += n;
			}
			return sum;
		};

		int sum = fn.apply(list);
		System.out.println("Sum: " + sum);
	}
}
