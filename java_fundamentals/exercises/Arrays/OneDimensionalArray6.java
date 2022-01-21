public class OneDimensionalArray6 {
	public static void main(String[] args) {
		int[] arr = {23, 5, 65, 23, 75, 346, 223, 23};

		// sort arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// print arr
		for (int n : arr) {
			System.out.print(n + ", ");
		}
	}
}
