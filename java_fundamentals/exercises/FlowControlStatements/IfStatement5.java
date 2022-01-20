public class IfStatement5 {
	public static void main(String[] args) {
		char ch = ' ';
		int asciiVal = (int)ch;

		if ( asciiVal >= 48 && asciiVal <= 57 )
			System.out.println("Digit");
		else if ( (asciiVal >= 65 && asciiVal <= 90 )
		          || ( asciiVal >= 97 && asciiVal <= 122 ))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}
}
