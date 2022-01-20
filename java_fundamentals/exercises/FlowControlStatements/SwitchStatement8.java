public class SwitchStatement8{
	public static void main(String[] args) {
		String code = args[0].toLowerCase();

		switch(code){
			case "r":
				System.out.println("Red");
				break;
			case "b":
				System.out.println("Blue");
				break;
			case "g":
				System.out.println("Green");
				break;
			case "o":
				System.out.println("Orange");
				break;
			case "y":
				System.out.println("Yellow");
				break;
			case "w":
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid Code");
		}	
	}
}
