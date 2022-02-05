import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Operations01 {

	public static int countChar(String str, char ch) {
		int count = 0;
		String chInStr = String.valueOf(ch);

		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).equalsIgnoreCase(chInStr)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String fileName;
		char charToCount;
		int count = 0;
		try {
			// take user inputs
			System.out.print("Enter File Name to read: ");
			fileName = br.readLine();
			System.out.print("Enter the character to be counted: ");
			charToCount = (char) br.read();

			// read from file
			BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
			String line;
			// count char in line
			while ((line = fileReader.readLine()) != null) {
				count += countChar(line, charToCount);
			}

			System.out.printf("File '%s' has '%d' instance of letter '%c'.", fileName, count, charToCount);
			fileReader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
