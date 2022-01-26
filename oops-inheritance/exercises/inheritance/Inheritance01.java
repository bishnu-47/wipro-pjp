class Animal {
	public void eat() {
		System.out.println("Animal eats.");
	}

	public void sleep() {
		System.out.println("Animal sleeps.");
	}
}

class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("Bird eats.");
	}

	@Override
	public void sleep() {
		System.out.println("Bird sleep.");
	}

	public void fly() {
		System.out.println("Bird flies.");
	}
}

public class Inheritance01 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}
