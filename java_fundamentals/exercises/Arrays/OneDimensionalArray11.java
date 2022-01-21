public class OneDimensionalArray11 {
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 4, 4, 1};

		// if arr contains any element other than 1&4, return true
		for (int n : arr) {
			if (n != 1 && n != 4) {
				System.out.println(false);
				return;
			}
		}

		System.out.println(true);
	}
}
