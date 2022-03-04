import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI02 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>(Arrays.asList(new Employee(101, "Rahul", 25, "Pune"),
				new Employee(102, "Rashmi", 23, "Banglore"), new Employee(103, "Sumit", 27, "Mumbai"),
				new Employee(104, "Ankit", 26, "Pune"), new Employee(105, "Ram", 22, "Pune")));

		ArrayList<Employee> newList = list	.stream()
											.filter(emp -> emp.location.equalsIgnoreCase("pune") ? true : false)
											.collect(Collectors.toCollection(ArrayList::new));

		newList.forEach(System.out::println);
	}
}
