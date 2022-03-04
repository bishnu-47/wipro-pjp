import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalInterface06 {

	public static String rev(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("civic", "leaf", "car", "radar", "train", "jumbojet",
				"level", "tank", "flower", "racecar"));

		Consumer<ArrayList<String>> c1 = (li) -> {
			for (int i = 0; i < list.size(); i++) {
				StringBuffer sb = new StringBuffer(li.get(i));
				li.set(i, sb.reverse()
							.toString());
			}
		};

		Consumer<String> c2 = System.out::println;

		c1.accept(list);
		list.forEach(c2);
	}
}
