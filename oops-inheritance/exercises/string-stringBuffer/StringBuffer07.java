public class StringBuffer07 {
	public static String trimX(String str) {
		// check if First & Last char is x
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
			return str.substring(1, str.length() - 1);
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
		String str = "xHix";

		System.out.println(trimX(str));
		System.out.println(trimX("America"));
	}
}
