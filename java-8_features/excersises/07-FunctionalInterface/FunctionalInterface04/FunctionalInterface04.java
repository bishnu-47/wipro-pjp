import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterface04 {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>(Arrays.asList(new Employee(101, "Rahul", 8000),
				new Employee(102, "Rashmi", 18000), new Employee(103, "Sumit", 7000), new Employee(104, "Ankit", 9000),
				new Employee(105, "Ram", 12000)));

		Predicate<Employee> pr = (emp) -> emp.getSalary() < 10_000 ? true : false;

		list.stream()
			.filter(pr)
			.forEach(System.out::println);
		;
	}
}
