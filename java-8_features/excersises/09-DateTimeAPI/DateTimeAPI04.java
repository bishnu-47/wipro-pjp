import java.time.LocalDate;

public class DateTimeAPI04 {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		int currentYear = todayDate.getYear();

		if (todayDate.isLeapYear()) {
			System.out.println(currentYear + " is a Leap Year.");
		} else {
			System.out.println(currentYear + " is a not Leap Year.");
		}
	}
}
