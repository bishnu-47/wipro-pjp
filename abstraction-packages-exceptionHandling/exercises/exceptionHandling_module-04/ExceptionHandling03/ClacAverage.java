import java.util.InputMismatchException;
import java.util.Scanner;

public class ClacAverage {

	public static double calcAvg(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}

		return sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st1Name, st2Name;
		int[] st1Marks = new int[3];
		int[] st2Marks = new int[3];

		try {
			for (int i = 1; i <= 2; i++) {
				// get student names
				System.out.print("Enter Student" + i + " name: ");
				if (i == 1)
					st1Name = sc.nextLine();
				else
					st2Name = sc.nextLine();

				// get student marks
				System.out.println("Enter marks of 3 subjects for Student" + i + ":");
				for (int j = 0; j < st2Marks.length; j++) {
					int marks = sc.nextInt();
					sc.nextLine();

					// throw an exception if marks is Invalid
					if (marks < 0 || marks > 100) {
						throw new InvalidMarksRangeException("Marks should be in range 0 to 100.");
					}

					if (i == 1) {
						st1Marks[j] = marks;
					} else {
						st2Marks[j] = marks;
					}
				}
			}

			// calculate averages
			double avg1 = calcAvg(st1Marks);
			double avg2 = calcAvg(st2Marks);

			// display averages of each student
			System.out.println("Avegare Marks of Student1: " + avg1);
			System.out.println("Avegare Marks of Student2: " + avg2);

		} catch (NumberFormatException | InputMismatchException |InvalidMarksRangeException ex) {
			System.out.println(ex);
		} finally {
			sc.close();
		}
	}
}
