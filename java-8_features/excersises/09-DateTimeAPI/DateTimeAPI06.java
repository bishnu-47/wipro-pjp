import java.time.LocalTime;

public class DateTimeAPI06 {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();

		System.out.println("Current time: " + currentTime);
		System.out.println("Time before 5 hrs and 30 mins: " + currentTime	.minusHours(5)
																			.minusMinutes(30));
	}
}
