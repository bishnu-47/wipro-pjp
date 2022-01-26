import java.io.*;

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch = 0;

		while (true) {
			printMenu();
			System.out.println("Enter your choice (1..6): ");

			ch = Integer.parseInt(br.readLine());

			switch (ch) {
			case 1: {
				System.out.print("Enter the name of the video you want to add: ");
				String name = br.readLine();

				vidStore.addVideo(name);
				break;
			}
			case 2: {
				System.out.print("Enter the name of the video you want to check out: ");
				String name = br.readLine();

				vidStore.doCheckout(name);
				break;
			}
			case 3: {
				System.out.print("Enter the name of the video you want to Return: ");
				String name = br.readLine();

				vidStore.doReturn(name);
				break;
			}
			case 4: {
				System.out.print("Enter the name of the video you want to Rate: ");
				String name = br.readLine();
				System.out.println("Enter the rating for this video: ");
				int rating = Integer.parseInt(br.readLine());

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
		}
	}
}
