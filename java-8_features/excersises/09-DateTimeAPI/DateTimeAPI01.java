import java.time.LocalDate;

public class DateTimeAPI01 {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today's Date: " + todayDate);

		LocalDate dateAfterTenDays = todayDate.plusDays(10);
		System.out.println("Date after 10 Days: " + dateAfterTenDays);
	}
}
