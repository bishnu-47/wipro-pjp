
public class Employee {
	int empNo;
	String name;
	String location;
	double salary;

	public Employee(int empNo, String name, double salary, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "empNo:" + empNo + ", name:" + name + ", salary:" + salary + ", location:" + location;
	}
}
