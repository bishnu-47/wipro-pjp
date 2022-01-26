class Shape {
	public void draw() {
		System.out.println("Drawing Shape.");
	}
	public void erase() {
		System.out.println("Erasing Shape.");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing Circle.");
	}
	public void erase() {
		System.out.println("Erasing Circle.");
	}
}

class Square extends Shape {
	public void draw() {
		System.out.println("Drawing Square.");
	}
	public void erase() {
		System.out.println("Erasing Square.");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing Triangle.");
	}
	public void erase() {
		System.out.println("Erasing Triangle.");
	}
}

public class Polymorphism02 {
	public static void main(String[] args) {
		Shape c = new Circle();
		Shape s = new Square();
		Shape t = new Triangle();

		c.draw();
		c.erase();

		s.draw();
		s.erase();

		t.draw();
		t.erase();
	}
}
