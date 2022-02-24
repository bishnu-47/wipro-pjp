import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecutingQueryAndProcessingResults02 {

	public static void main(String[] args) {
		try {
			// register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			// create Statement
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM employees WHERE salary BETWEEN 1000 AND 2000");

			System.out.println("emp_id \t emp_name \t email \t salary");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("first_name") + "\t" + rs.getString("email")
						+ "\t" + rs.getInt("salary"));
			}

			stmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
