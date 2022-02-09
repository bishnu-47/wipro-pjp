import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	TreeSet<Employee> empSet = new TreeSet<>();

	public boolean addEmployee(Employee emp) {
		return empSet.add(emp);
	}

	public void displayAllEmployees() {
		Iterator<Employee> itr = empSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ram", 55000);
		Employee emp2 = new Employee(2, "Mohit", 25000);
		Employee emp3 = new Employee(3, "Salman", 40000);
		Employee emp4 = new Employee(4, "Lakshmi", 30000);

		TreeSetDemo emps = new TreeSetDemo();
		emps.addEmployee(emp1);
		emps.addEmployee(emp2);
		emps.addEmployee(emp3);
		emps.addEmployee(emp4);

		emps.displayAllEmployees();
	}
}
