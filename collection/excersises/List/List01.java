import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void printAll(List<String> list) {
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Amit");
		list.add("Ram");
		list.add("Suresh");
		list.add("Himesh");
		list.add("Tanu");

		printAll(list);
	}
}
