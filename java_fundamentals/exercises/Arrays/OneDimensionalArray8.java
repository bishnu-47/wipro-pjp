public class OneDimensionalArray8 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 23, 53, 7, 4};
		int start = -1, end = -1;
		int sum = 0;

		// mark index of 6 & 7
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == 6)
				start = i;
			if (arr[i] == 7)
				end = i;
		}

		// add elements skipping numbers between and including 6&7
		for (int i = 0; i < arr.length ; i++) {
			if ( start != -1 && end != -1 && end > start && i >= start && i <= end )
				continue;
			else
				sum += arr[i];
		}

		System.out.println("Sum = " + sum);
	}
}
