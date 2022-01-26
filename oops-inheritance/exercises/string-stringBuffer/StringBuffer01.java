public class StringBuffer01 {
	public static String reverse(String str) {
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}

		return revStr;
	}

	public static void main(String[] args) {
		String str = "bob";

		String strRev = reverse(str);

		if (str.equals(strRev)) {
			System.out.println("It's Palindrome");
		} else {
			System.out.println("It's not a Palindrome");
		}
	}
}
