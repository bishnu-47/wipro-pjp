import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalInterface07 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 3, 8, 7, 57, 36, 94, 99, 112, 49));

		Consumer<ArrayList<Integer>> c1 = (li) -> {
			for (int i = 0; i < li.size(); i++) {
				int num = li.get(i);
				if (num % 2 == 0) {
					System.out.println(num + " even.");
				} else {
					System.out.println(num + " odd.");
				}
			}
		};

		c1.accept(list);
	}
}
