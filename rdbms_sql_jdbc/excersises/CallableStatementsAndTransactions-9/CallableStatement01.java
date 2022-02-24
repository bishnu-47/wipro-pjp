import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class CallableStatement01 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

			while (rs.next()) {
				CallableStatement cstatement = conn.prepareCall("{CALL calc_net_sal(?, ?)}");
				cstatement.registerOutParameter(2, Types.DOUBLE);
				cstatement.setInt(1, rs.getInt("empno"));
				cstatement.execute();

				double netSalary = cstatement.getDouble(2);
				System.out.println("EmpNo: " + rs.getInt("empno") + "\tEmp Name: " + rs.getString("ename")
						+ "\t\tNet Salary: " + netSalary);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}