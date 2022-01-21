public class OneDimensionalArray10 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] newArr = new int[arr.length];

		int j = 0;
		// first take the even elements to newArr
		for (int i = 0; i < arr.length ; i++ ) {
			if (arr[i] % 2 == 0) {
				newArr[j] = arr[i];
				j++;
			}
		}

		// take odd elements to newArr
		for (int i = 0; i < arr.length ; i++ ) {
			if (arr[i] % 2 != 0) {
				newArr[j] = arr[i];
				j++;
			}
		}

		// print newArr
		for (int n : newArr) {
			System.out.print(n + ", ");
		}
	}
}
