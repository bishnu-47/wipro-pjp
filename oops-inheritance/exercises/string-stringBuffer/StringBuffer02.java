public class StringBuffer02 {
	public static String concatToLower(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		String concatResult = "";

		// check last alphabet & first alphabet of two strings
		if (str1.charAt(str1.length() - 1) == str2.charAt(0) ) {
			concatResult = str1 + str2.substring(1);
		} else {
			concatResult = str1 + str2;
		}

		return concatResult;
	}

	public static void main(String[] args) {
		String str1 = "Mark";
		String str2 = "Kate";

		System.out.println(concatToLower(str1, str2));
		System.out.println(concatToLower("Sachin", "Tendulkar"));
	}
}
