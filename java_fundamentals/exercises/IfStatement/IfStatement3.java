public class IfStatement3 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No Values");
			return;
		}

		for (String str : args) {
			System.out.print(str + ", ");
		}
	}
}
