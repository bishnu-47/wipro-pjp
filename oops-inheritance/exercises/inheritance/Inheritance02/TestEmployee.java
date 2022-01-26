public class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee("Harry", 6_00_000, "2021", "101AB");

		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee annual salary: " + emp.getAnnualSalary());
		System.out.println("The year employee started working: " + emp.getJoiningYear());
		System.out.println("National Insurance Number of employee: " + emp.getNationalInsuranceNo());
	}
}
