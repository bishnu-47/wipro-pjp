import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPI02 {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		LocalDate nextMonth = todayDate.plusMonths(1);
		LocalDate secondSundayDate = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

		System.out.println("Date of next Month second sunday: " + secondSundayDate);
	}
}
