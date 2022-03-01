interface ICount {
	int digitCount(int n);
}

public class MethodReference02 {

	public static int digitCount(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		ICount c = MethodReference02::digitCount;
		System.out.println(c.digitCount(12345));
	}
}
