public class StringBuffer05 {
	public static String trimFirstAndLast(String str) {
		if (str.length() < 2) {
			return "";
		}

		return str.substring(1, str.length() - 1);
	}

	public static void main(String[] args) {
		String str = "Suman";

		System.out.println(trimFirstAndLast(str));
	}
}
