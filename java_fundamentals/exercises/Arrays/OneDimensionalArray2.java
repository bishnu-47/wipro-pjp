public class OneDimensionalArray2 {
	public static void main(String[] args) {
		int[] arr = {324, 465, 234, 56, 234, 534};
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int val : arr) {
			if (val > max)
				max = val;
			if (val < min)
				min = val;
		}

		System.out.println("Max Value = " + max);
		System.out.println("Min Value = " + min);
	}
}
