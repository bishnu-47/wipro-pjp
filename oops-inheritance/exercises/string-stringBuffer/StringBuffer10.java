public class StringBuffer10 {
	public static String appendLastThree(String str, int n) {
		StringBuffer strBuff = new StringBuffer();

		for (int i = 0; i < n; i++) {
			strBuff.append(str.substring(n - 1));
		}

		return strBuff.toString();
	}

	public static void main(String[] args) {
		String str = "Wipro";

		System.out.println(appendLastThree(str, 3));
	}
}
