import java.util.Arrays;

public class ParallelArraySorting01 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 8, 7, 57, 36, 94, 99, 112, 49 };
		Arrays.parallelSort(arr);
		System.out.println("Sum of min and max value: " + (arr[0] + arr[arr.length - 1]));
	}
}
