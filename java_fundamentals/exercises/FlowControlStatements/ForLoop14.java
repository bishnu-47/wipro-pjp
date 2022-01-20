public class ForLoop14 {
	public static void main(String[] args) {
		int num = 12345, sum = 0;

		for (int i = num; i > 0; i = i / 10) {
			int rem = i % 10;
			sum += rem;
		}

		System.out.println(sum);
	}
}
