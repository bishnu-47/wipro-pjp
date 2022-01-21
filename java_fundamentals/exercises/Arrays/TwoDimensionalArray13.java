public class TwoDimensionalArray13 {
	public static void main(String[] args) {
		if (args.length < 4) {
			System.out.println("Please enter 4 integer numbers!");
			return;
		}

		int[][] arr = new int[2][2];
		int k = 0;

		// convert single to two dimensional array
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(args[k]);
				k++;
			}
		}

		// print original 2D-Array
		System.out.println("The given array is:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int[][] revArr = new int[2][2];

		// reverse the 2D-Array
		for (int i = 0, m = 1; m >= 0; i++, m--) {
			for (int j = 0, n = 1; n >= 0; j++, n--) {
				revArr[i][j] = arr[m][n];
			}
		}

		// print reversed 2D-Array
		System.out.println("The reverse of the array is:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(revArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
