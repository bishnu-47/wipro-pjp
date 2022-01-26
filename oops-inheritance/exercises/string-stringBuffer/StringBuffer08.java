public class StringBuffer08 {
	public static String removeLeftAndRightOfStar(String str) {
		int index = str.indexOf('*');

		// early return if * is not found
		if (index == -1) {
			return str;
		}

		return str.substring(0, index - 1) + str.substring(index + 2);
	}

	public static void main(String[] args) {
		String str = "abz*zcd";

		System.out.println(removeLeftAndRightOfStar(str));
	}
}
