import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecutingQueryAndProcessingResults01 {

	public static void main(String[] args) {
		try {
			// register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			// create Statement
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

			while (rs.next()) {
				int empNo = rs.getInt(1);
				String name = rs.getString("first_name");
				System.out.println(empNo + "\t" + name);
			}

			stmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}