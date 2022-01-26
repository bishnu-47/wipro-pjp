public class StringBuffer06 {
	public static String concatShortLong(String str1, String str2) {
		String shorter = "", longer = "";

		if (str1.length() < str2.length()) {
			shorter = str1;
			longer = str2;
		} else {
			shorter = str2;
			longer = str1;
		}

		return shorter + longer + shorter;
	}

	public static void main(String[] args) {
		String a = "hi";
		String b = "hello";

		System.out.println(concatShortLong(a, b));
	}
}
