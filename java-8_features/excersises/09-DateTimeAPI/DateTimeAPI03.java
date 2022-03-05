import java.time.LocalDate;
import java.time.Period;

public class DateTimeAPI03 {

	public static void main(String[] args) {
		LocalDate joiningDate = LocalDate.of(2022, 1, 23);
		Period d = Period.between(joiningDate, LocalDate.now());

		System.out.println("Number of year: " + d.getYears());
		System.out.println("Number of months: " + d.getMonths());
		System.out.println("Number of days: " + d.getDays());
	}
}
