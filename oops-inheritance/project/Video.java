public class Video {
	private String videoName;
	private boolean checkout;
	private int rating;

	public Video(String name) {
		this.videoName = name;
		this.checkout = false;
		this.rating = 0;
	}

	public String getName() {
		return this.videoName;
	}

	public void doCheckout() {
		System.out.printf("Video \"%s\" checked out successfully.%n%n", this.videoName);
		this.checkout = true;
	}

	public void doReturn() {
		System.out.printf("Video \"%s\" returned successfully.%n%n", this.videoName);
		this.checkout = false;
	}

	public void receiveRating(int rating) {
		if (rating < 0 && rating > 10) {
			System.out.println("Please rate between 1 to 10.\n");
		} else {
			this.rating = rating;
		}
	}

	public int getRating() {
		return this.rating;
	}

	public boolean getCheckout() {
		return this.checkout;
	}
}
