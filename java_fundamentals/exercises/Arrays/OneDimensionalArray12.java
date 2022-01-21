public class OneDimensionalArray12 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {5, 6, 7};
		int[] c = new int[2];

		// grab the mid element
		int mid = (int)a.length / 2;
		c[0] = a[mid];
		c[1] = b[mid];

		System.out.printf("[%d, %d]", c[0], c[1]);
	}
}
