
public class Interfaces02 {

	public static void main(String[] args) {
		ITest t1 = (a, b, c) -> a + b + c;
		ITest t2 = (a, b, c) -> a * b * c;
		
		System.out.println(t1.myFunction(2, 4, 6));
		System.out.println(t2.myFunction(2, 4, 6));
	}
}
