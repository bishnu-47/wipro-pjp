public class VideoStore {
	private Video[] store;
	private int idxCounter;

	public VideoStore() {
		store = new Video[10];
		idxCounter = 0;
	}

	public void addVideo(String name) {
		Video vid = new Video(name);
		store[idxCounter] = vid;
		idxCounter++;

		System.out.printf("Video \"%s\" added successfully.%n%n", name);
	}

	public void doCheckout(String name) {
		int idx = getVideoIndex(name);

		if (idx == -1) {
			System.out.println("Video Not Found!");
		} else {
			store[idx].doCheckout();
		}
	}

	public void doReturn(String name) {
		int idx = getVideoIndex(name);

		if (idx == -1) {
			System.out.println("Video Not Found!");
		} else {
			store[idx].doReturn();
		}
	}

	public void receiveRating(String name, int rating) {
		int idx = getVideoIndex(name);

		if (idx == -1) {
			System.out.println("Video Not Found!");
		} else {
			store[idx].receiveRating(rating);
		}
	}

	public void listInventory() {
		System.out.printf("%-15s %-18s %-15s %n", "Video Name", "Checkout Status", "Rating");

		for (Video v : store) {
			if (v == null) break;

			System.out.printf("%-15s %-18b %-15d %n%n", v.getName(), v.getCheckout(), v.getRating());
		}
	}

	private int getVideoIndex(String name) {
		for (int i = 0; i < store.length; i++) {
			if (store[i].getName().equalsIgnoreCase(name)) {
				return i;
			}
		}

		return -1;
	}
}
