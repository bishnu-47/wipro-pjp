public class IfStatement6{
	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("Please enter all arguments, Gender and Age");
			return;
		}

		String gender = args[0];
		int age = Integer.parse(args[1]);

		if(gender.equals(""))
	}
}
