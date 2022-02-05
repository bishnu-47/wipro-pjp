import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Operations02 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Enter Input File Name: ");
			String inFile = br.readLine();
			System.out.print("Enter Output File Name: ");
			String outFile = br.readLine();

			BufferedReader reader = new BufferedReader(new FileReader(inFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

			// copy contents
			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line + "\n");
			}

			System.out.println("File copied.");
			reader.close();
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
