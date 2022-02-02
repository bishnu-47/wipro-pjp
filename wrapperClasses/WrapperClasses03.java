import java.util.Scanner;

public class WrapperClasses03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 255 for binary conversion: ");
		int no = sc.nextInt();
		sc.nextLine();

		if (no < 0 || no > 255) {
			System.out.println("Invalid Input");
		} else {
			String str = String.format("%08d", Integer.parseInt(Integer.toBinaryString(no)));
			System.out.println(str);
		}

		sc.close();
	}
}
