import java.util.Optional;

class Employee {
	String name;
	double salary;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}

class InvalidEmployeeException extends Exception {
	public InvalidEmployeeException() {
		super("Invalid Employee");
	}
}

public class OptionalClass03 {
	Employee emp;

	public static void main(String[] args) throws InvalidEmployeeException {
		OptionalClass03 obj = new OptionalClass03();

		Optional<Employee> opt = Optional.ofNullable(obj.emp);
		System.out.println(opt.orElseThrow(InvalidEmployeeException::new));
	}
}
