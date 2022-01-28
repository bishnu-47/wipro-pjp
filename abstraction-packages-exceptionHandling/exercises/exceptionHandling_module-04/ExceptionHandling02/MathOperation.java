
public class MathOperation {
	public static void main(String[] args) {
		if (args.length < 0) {
			System.out.println("Pass some integer values.");
			return;
		}

		try {
			int sum = 0;
			double avg = 0.0;

			for (String no : args) {
				sum += Integer.parseInt(no);
			}
			avg = sum / args.length;

			System.out.println("Sum: " + sum);
			System.out.println("Average: " + avg);
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e);
		}
	}
}
