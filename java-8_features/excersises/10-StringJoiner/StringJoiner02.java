import java.util.StringJoiner;

public class StringJoiner02 {

	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Pune");
		s1.add("Bangalore");
		s1.add("Indore");
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Hyderabad");
		s2.add("Mumbai");
		s2.add("Chennai");

		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));
	}
}
