import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoiner01 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(
				Arrays.asList("Rohan", "Ankit", "Ritwik", "Milan", "Gaurav", "Nayan", "Richa", "Ram", "Maya"));

		StringJoiner sj = new StringJoiner(", ", "{", "}");
		names	.stream()
				.forEach(name -> sj.add(name));

		System.out.println(sj);
	}
}
