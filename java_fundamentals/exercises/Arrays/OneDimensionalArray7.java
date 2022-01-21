public class OneDimensionalArray7 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 2, 2, 3, 4, 5, 5};
		int[] newArr = new int[arr.length];

		//sort the arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int j = 0;
		// copy elements to newArr skipping duplicates
		for (int i = 0; i < arr.length ; i++) {
			if (i != 0 && arr[i - 1] == arr[i])
				continue;

			newArr[j] = arr[i];
			j++;
		}


		// print newArr
		for (int i = 0; i < j; i++) {
			System.out.print(newArr[i] + ", ");
		}
	}
}
