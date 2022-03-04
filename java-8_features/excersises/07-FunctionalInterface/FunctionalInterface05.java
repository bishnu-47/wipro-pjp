import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterface05 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 3, 9, 7, 57, 36, 95, 99, 112, 49));

		// check perfect sq
		Predicate<Integer> pr = (no) -> {
			double sqrt = Math.sqrt(no);
			return ((sqrt - Math.floor(sqrt)) == 0);
		};

		list.stream()
			.filter(pr)
			.forEach(System.out::println);
	}
}
