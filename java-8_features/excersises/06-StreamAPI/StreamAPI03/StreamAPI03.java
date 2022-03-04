import java.util.ArrayList;
import java.util.Arrays;

public class StreamAPI03 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>(
				Arrays.asList(new Student(1, "Ramesh", 79), new Student(2, "Suresh", 49), new Student(3, "Mohan", 67),
						new Student(4, "Puja", 41), new Student(5, "Rohan", 75)));

		int totalPassed = (int) list.stream()
									.filter(s -> s.marks > 50 ? true : false)
									.count();

		System.out.println("Total cleared the exam: " + totalPassed);
	}
}
