import java.util.Arrays;

public class ParallelArraySorting03 {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 3, 57, 7, 36, 94, 99, 112, 49 };

		// print before sorting
		System.out.println("Before Sorting");
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();

		// sort
		Arrays.parallelSort(arr, 0, 5);

		// print after sorting
		System.out.println("Afer Sorting first 5 elements");
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
}
