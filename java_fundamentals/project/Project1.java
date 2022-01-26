public class Project1 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide EmployeeId.");
			return;
		}

		String empId = args[0];

		// initialize table data
		String[][] employeeTable = {
			{"Emp No", "Emp Name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT"},
			{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
			{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
			{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
			{"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
			{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
			{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
			{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"},
		};

		String[][] designationTable = {
			{"Designation Code", "Designation", "DA"},
			{"e", "Engineer", "20000"},
			{"c", "Consultant", "32000"},
			{"k", "Clerk", "12000"},
			{"r", "Receptionist", "15000"},
			{"m", "Manager", "40000"},
		};

		int empDetailRow = -1, basic = -1, hra = -1, it = -1;
		String desigCode = null, department = null, name = null;
		// search employee with Id & get all details
		for (int i = 0; i < employeeTable.length; i++) {
			if (employeeTable[i][0].equals(empId)) {

				empDetailRow = i;
				name = employeeTable[i][1];
				desigCode = employeeTable[i][3];
				department = employeeTable[i][4];

				basic = Integer.parseInt(employeeTable[i][5]);
				hra = Integer.parseInt(employeeTable[i][6]);
				it = Integer.parseInt(employeeTable[i][7]);
				break;
			}
		}

		// early return if employee not found
		if (empDetailRow == -1) {
			System.out.println("There is no employee with empid : " + empId);
			return;
		}

		int da = -1;
		String designation = null;
		// get DA & designation from designationTable
		for (int i = 0; i < designationTable.length; i++) {
			if (designationTable[i][0].equals(desigCode)) {
				designation = designationTable[i][1];
				da = Integer.parseInt(designationTable[i][2]);
				break;
			}
		}

		// calculate salary
		int salary = basic + hra + da - it;

		// output the result
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Emp No.","Emp Name","Department","Designation","Salary");
		System.out.printf("%-15s %-15s %-15s %-15s %d%n", empId, name, department, designation, salary);
	}
}
