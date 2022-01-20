public class IfStatement7 {
	public static void main(String[] args) {
		char ch = 'Z';
		int asciiVal = (int)ch;

		// lower to upper
		if (asciiVal >= 97 && asciiVal <= 122)
			System.out.println((char)(asciiVal - 32));
		// upper to lower
		else if (asciiVal >= 65 && asciiVal <= 90)
			System.out.println((char)(asciiVal + 32));
		else
			System.out.println(ch);
	}
}
