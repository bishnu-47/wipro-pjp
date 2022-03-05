import java.util.Arrays;
import java.util.Scanner;

public class ParallelArraySorting02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take string as input
		String st = "";
		try {
			System.out.print("Enter a String: ");
			st = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}

		// convert into char array
		char[] chArr = st.toCharArray();

		// sort array using parallel sort
		Arrays.parallelSort(chArr);

		// convert the array to string and display result
		String newStr = "";

		for (char ch : chArr) {
			newStr += ch;
		}

		System.out.println(newStr);

		sc.close();
	}
}
