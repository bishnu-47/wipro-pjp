import java.time.LocalTime;

public class DateTimeAPI05 {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time: " + currentTime);
		System.out.println("Time after 25 mins: " + currentTime.plusMinutes(25));
	}
}
