import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class DAO {
	Connection conn;

	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public void insert(int rollNo, String name, String standard, String dob, int fee) {
		String[] arr = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
		ArrayList<String> validStandard = new ArrayList<String>(Arrays.asList(arr));

		if (!validStandard.contains(standard)) {
			System.out.println("Enter valid Standard(contains only Romans I, II, ... to X)!");
		}

		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?, ?, ?)");
			ps.setInt(1, rollNo);
			ps.setString(2, name);
			ps.setString(3, standard);
			ps.setDate(4, Date.valueOf(dob));
			ps.setInt(5, fee);

			ps.executeUpdate();
			System.out.println("Data Inserted.");
			ps.close();
		} catch (IllegalArgumentException iae) {
			System.out.println("Date should be in format yyyy-mm-dd");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void delete(int rollNo) {
		// store data into StudentLog before removing
		try {
			// get data from student table
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM student WHERE rollno=?");
			ps.setInt(1, rollNo);
			ResultSet rs = ps.executeQuery();

			// remove data from student table
			ps = conn.prepareStatement("DELETE FROM student WHERE rollno=?");
			ps.setInt(1, rollNo);
			ps.executeUpdate();

			// store data in StudentLog table
			while (rs.next()) {
				ps = conn.prepareStatement("Insert INTO StudentLog VALUES(?, ?, ?, ?)");

				ps.setInt(1, rollNo);
				ps.setString(2, rs.getString(2));
				ps.setString(3, rs.getString(3));
				ps.setDate(4, Date.valueOf(LocalDate.now()));

				ps.executeUpdate();
			}

			ps.close();
			System.out.println("Record removed.");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void update(int rollNo, int fees) {
		try {
			PreparedStatement ps = conn.prepareStatement("UPDATE student SET fees=? WHERE rollno=?");
			ps.setInt(1, fees);
			ps.setInt(2, rollNo);
			ps.executeUpdate();

			ps.close();
			System.out.println("Record updated.");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void display(int rollNo) {
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM student WHERE rollno=?");
			ps.setInt(1, rollNo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}

			ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void display() {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * FROM student");

			while (rs.next()) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}

			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}