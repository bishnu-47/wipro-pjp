import java.util.ArrayList;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();

		list.add(29);
		list.add(2.2F);
		list.add(3.2D);
		list.add(5.231D);

		System.out.println(list);
	}
}
