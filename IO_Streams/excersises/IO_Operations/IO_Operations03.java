import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class IO_Operations03 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Pass input and output file name.");
			return;
		}

		String inFile = args[0];
		String outFile = args[1];
		Map<String, Integer> map = new TreeMap<String, Integer>();

		try {
			// read data
			BufferedReader reader = new BufferedReader(new FileReader(inFile));
			String line;

			while ((line = reader.readLine()) != null) {
				String[] strArr = line.split(" ");

				for (String s : strArr) {
					if (!map.containsKey(s)) {
						map.put(s, 1);
					} else {
						map.put(s, map.get(s) + 1);
					}
				}
			}

			// write data
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
			for (String key : map.keySet()) {
				writer.write(key + " : " + map.get(key) + "\n");
			}

			System.out.println("Output generated.");
			reader.close();
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
