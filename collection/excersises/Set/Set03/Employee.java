
public class Employee implements Comparable<Employee> {
	int empId;
	String name;
	float salary;

	public Employee(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		if (emp.salary < this.salary) {
			return 1;
		} else if (emp.salary > this.salary) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
}
