public class ForLoop12 {
	public static void main(String[] args) {
		int num = 49, count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
			if (count > 2)
				break;
		}


		if (count > 2)
			System.out.println("Not a Prime Number");
		else
			System.out.println("Prime Number");
	}
}
