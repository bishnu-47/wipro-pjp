
public class MyClassWithLambda {

	public static void main(String[] args) {
		IWordCount wc = n -> n.length();

		System.out.println(wc.count("hello"));
		System.out.println(wc.count("universe"));
	}
}
