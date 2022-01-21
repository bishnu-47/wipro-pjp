public class OneDimensionalArray3 {
	public static void main(String[] args) {
		int[] arr = {23, 53, 67, 43, 91, 34};
		int searchElement = 43;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchElement) {
				System.out.println(i);
				found = true;
				break;
			}
		}

		if (!found)
			System.out.println(-1);
	}
}
