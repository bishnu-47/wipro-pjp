import java.util.ArrayList;

public class ForEach01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String[] arr = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}

		al.forEach(day -> {
			System.out.println(day);
		});
	}
}
