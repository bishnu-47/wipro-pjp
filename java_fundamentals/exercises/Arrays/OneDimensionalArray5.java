public class OneDimensionalArray5 {
	public static void main(String[] args) {
		int[] arr = {12, 54, 2, 64, 135, 65, 64, 234, 54};

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

		System.out.printf("Largest two numbers: %d, %d %n", arr[arr.length - 2], arr[arr.length - 1]);
		System.out.printf("Smallest two numbers: %d, %d %n", arr[0], arr[1]);
	}
}
