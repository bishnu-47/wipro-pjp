import java.util.ArrayList;

public class ForEach02 {

	public static void main(String[] args) {
		int[] ids = { 100, 101, 102, 103, 104 };
		String[] names = { "Ram", "Rahul", "Sohan", "Andrew", "Rita" };
		String[] addresses = { "mumbai", "banglore", "pune", "london", "jaipur" };
		double[] salaries = { 55000, 87000, 30000, 40000, 90000 };

		ArrayList<Employee> al = new ArrayList<Employee>();
		for (int i = 0; i < ids.length; i++) {
			Employee emp = new Employee(ids[i], names[i], addresses[i], salaries[i]);
			al.add(emp);
		}

		al.forEach(emp -> {
			System.out.println("Id: " + emp.getId());
			System.out.println("Name: " + emp.getName());
			System.out.println("Address: " + emp.getAddress());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println();
		});
	}
}
