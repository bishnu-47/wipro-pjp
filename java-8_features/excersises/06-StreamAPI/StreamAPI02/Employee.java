
public class Employee {
	int empNo;
	String name;
	int age;
	String location;

	public Employee(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	@Override
	public String toString() {
		return "empNo:" + empNo + ", name:" + name + ", age:" + age + ", location:" + location;
	}
}
