class Box {
	private int width;
	private int height;
	private int depth;

	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}

	public int calcVolume() {
		return width * height * depth;
	}
}

public class ClassesAndObjects01 {
	public static void main(String[] args) {
		Box b1 = new Box(12, 5, 10);
		System.out.println(b1.calcVolume());
	}
}
