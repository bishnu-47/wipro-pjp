public class OneDimensionalArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		int sum = 0;
		float avg = 0;
		for (int no : arr) {
			sum += no;
		}

		avg = (float)sum / arr.length;

		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + avg);
	}
}
