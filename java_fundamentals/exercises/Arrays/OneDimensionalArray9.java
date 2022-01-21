public class OneDimensionalArray9 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 10, 3, 10, 4, 10};

		// replace 10 with 0
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == 10)
				arr[i] = 0;
		}

		// shift the array to left
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] != 0)
				continue;
			for (int j = i + 1; j < arr.length ; j++) {
				if (arr[j] != 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
		}

		// print the array
		for (int n : arr) {
			System.out.print(n + ", ");
		}
	}
}
