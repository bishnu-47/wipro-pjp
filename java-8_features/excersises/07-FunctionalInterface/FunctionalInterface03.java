import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterface03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("civic", "leaf", "car", "radar", "train", "jumbojet",
				"level", "tank", "flower", "racecar"));

		Predicate<String> pr = (str) -> {
			StringBuilder sb = new StringBuilder(str);
			String rev = sb	.reverse()
							.toString();
			return str.equals(rev) ? true : false;
		};

		list.stream()
			.filter(pr)
			.forEach(System.out::println);
	}
}
