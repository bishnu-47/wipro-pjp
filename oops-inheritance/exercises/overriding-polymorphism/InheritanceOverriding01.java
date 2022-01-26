class Fruit {
	String name;
	String taste;
	float size;

	public Fruit(String name, String taste, float size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public void eat() {
		System.out.printf("I am %s and I am %s in taste.%n", name, taste);
	}
}

class Apple extends Fruit {
	public Apple(String name, String taste, float size) {
		super(name, taste, size);
	}

	@Override
	public void eat() {
		System.out.printf("I am %s and I am %s in taste.%n", name, taste);
	}
}


class Orange extends Fruit {
	public Orange(String name, String taste, float size) {
		super(name, taste, size);
	}

	@Override
	public void eat() {
		System.out.printf("I am %s and I am %s in taste.%n", name, taste);
	}
}

public class InheritanceOverriding01 {
	public static void main(String[] args) {
		Fruit apple  = new Apple("Apple", "sweet", 8);
		Fruit orange  = new Orange("Orange", "sour", 12);

		apple.eat();
		orange.eat();
	}
}
