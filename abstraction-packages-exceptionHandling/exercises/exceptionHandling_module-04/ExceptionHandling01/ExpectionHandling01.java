import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionHandling01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			// take array length
			System.out.print("Enter length of array: ");
			int size = sc.nextInt();
			sc.nextLine();

			int[] arr = new int[size];

			// take array elements
			System.out.println("Enter array elements:");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sc.nextLine();
			}

			// take array index
			System.out.print("Enter array index you want to access: ");
			int idx = sc.nextInt();
			sc.nextLine();

			System.out.println("Array element at index " + idx + " is " + arr[idx]);
			System.out.println("The array element successfully accessed.");
			sc.close();
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | InputMismatchException e) {
			System.out.println(e);
		}
	}
}
