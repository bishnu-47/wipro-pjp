
public class EmployeeCloneTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ramesh", "IT");
		Employee emp2;

		emp2 = emp1.clone();

		emp1.setDepartment("sales");
		emp1.setName("Suresh");
		emp1.setEmpId(2);

		System.out.println("emp1: " + emp1.toString());
		System.out.println("emp2: " + emp2.toString());
	}
}
