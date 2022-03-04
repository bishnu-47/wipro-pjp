import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionalInterface01 {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>(Arrays.asList(new Employee(101, "Rahul", 25000, "Pune"),
				new Employee(102, "Rashmi", 23000, "Banglore"), new Employee(103, "Sumit", 27000, "Mumbai"),
				new Employee(104, "Ankit", 26000, "Pune"), new Employee(105, "Ram", 22000, "Pune")));
		ArrayList<String> locations = new ArrayList<String>();

		Function<Employee, String> fn = (emp) -> emp.location;
		list.forEach(emp -> locations.add(fn.apply(emp)));

		locations.forEach(System.out::println);
	}
}
