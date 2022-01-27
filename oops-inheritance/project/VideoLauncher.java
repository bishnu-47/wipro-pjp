import java.util.*;

public class VideoLauncher {

	public static void printMenu() {
		System.out.println("MAIN MENU");
		System.out.println("=========");
		System.out.println("1. Add Videos:");
		System.out.println("2. Check Out Video:");
		System.out.println("3. Return Video:");
		System.out.println("4. Receive Rating:");
		System.out.println("5. List Inventory:");
		System.out.println("6. Exit:");
	}

	public static void main(String[] args) {
		VideoStore vidStore = new VideoStore();
		Scanner sc = new Scanner(System.in);
		int ch;

		do {
			printMenu();
			System.out.print("Enter your choice (1..6): ");

			ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1: {
				System.out.print("Enter the name of the video you want to add: ");
				String name = sc.nextLine();

				vidStore.addVideo(name);
				break;
			}
			case 2: {
				System.out.print("Enter the name of the video you want to check out: ");
				String name = sc.nextLine();

				vidStore.doCheckout(name);
				break;
			}
			case 3: {
				System.out.print("Enter the name of the video you want to Return: ");
				String name = sc.nextLine();

				vidStore.doReturn(name);
				break;
			}
			case 4: {
				System.out.print("Enter the name of the video you want to Rate: ");
				String name = sc.nextLine();
				System.out.print("Enter the rating for this video: ");
				int rating = sc.nextInt();
				sc.nextLine();

				vidStore.receiveRating(name, rating);
				break;
			}
			case 5:
				vidStore.listInventory();
				break;
			case 6:
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			default:
				System.out.println("Please Enter correct choise!");
			}
		} while (ch != 6);
	}
}
