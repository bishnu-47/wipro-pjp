public class Employee extends Person {
	private double annualSalary;
	private String joiningYear;
	private String nationalInsuranceNo;

	public Employee(String name, double annualSalary, String joiningYear, String nationalInsuranceNo) {
		super(name);

		this.annualSalary = annualSalary;
		this.joiningYear = joiningYear;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	// getters
	public double getAnnualSalary() {
		return annualSalary;
	}

	public String getJoiningYear() {
		return joiningYear;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	// setters
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}
}
