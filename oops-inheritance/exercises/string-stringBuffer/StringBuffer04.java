public class StringBuffer04 {
	public static String getFirstHalf(String str) {
		if (str.length() % 2 == 0) {
			return str.substring(0, str.length() / 2);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		String str = "TomCat";

		System.out.println(getFirstHalf(str));
		System.out.println(getFirstHalf("Apron"));
	}
}
