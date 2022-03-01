import java.util.ArrayList;

public class LambdaExpressions02 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String[] arr = { "flower", "fire", "stone", "tree", "river", "mountain", "tiger", "ocean", "hill", "bob" };

		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}

		al.forEach(itm -> {
			StringBuilder sb = new StringBuilder(itm);
			System.out.println(sb.reverse());
		});
	}
}
