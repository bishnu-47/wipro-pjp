public class StringBuffer09 {
	public static String combineStrings(String str1, String str2) {
		int str1Len = str1.length();
		int str2Len = str2.length();
		int loopIteration = (str1Len > str2Len) ? str1Len : str2Len;
		StringBuffer combinedStr = new StringBuffer();

		for (int i = 0; i < loopIteration; i++) {
			// first take letter from 1st str
			if (i < str1Len)
				combinedStr.append(str1.charAt(i));

			// then take letter from 2nd str
			if (i < str2Len)
				combinedStr.append(str2.charAt(i));
		}

		// append remaning letters
		if (str1Len > str2Len) {
			combinedStr.append(str1.substring(loopIteration));
		} else if (str2Len > str1Len) {
			combinedStr.append(str2.substring(loopIteration));
		}

		return combinedStr.toString();
	}

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		System.out.println(combineStrings(str1, str2));
	}
}
