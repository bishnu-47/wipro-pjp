import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-2, 3, -4, 8, 7));

		ArrayList<Integer> newList = list	.stream()
											.filter(no -> (no < 0 && no % 2 == 0) ? false : true)
											.collect(Collectors.toCollection(ArrayList::new));

		newList.forEach(System.out::println);
	}
}
