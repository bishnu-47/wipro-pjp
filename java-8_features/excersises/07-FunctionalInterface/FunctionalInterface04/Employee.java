
public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id:" + id + ", name:" + name + ", salary:" + salary;
	}
}
