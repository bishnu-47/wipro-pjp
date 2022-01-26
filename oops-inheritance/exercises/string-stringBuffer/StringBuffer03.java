public class StringBuffer03 {
	public static String getTwoChars(String str) {
		String newStr = "";

		// get and join first two char of given str
		for (int i = 0; i < str.length(); i++) {
			newStr += str.substring(0, 2);
		}

		return newStr;
	}

	public static void main(String[] args) {
		String str = "Wipro";

		System.out.println(getTwoChars(str));
	}
}
