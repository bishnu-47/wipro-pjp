import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnection01 {

	public static void main(String[] args) {
		try {
			// register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			
			System.out.println("Connection Established Successfuly.");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Connection could not be Established!");
			System.out.println(e);
		}
	}
}