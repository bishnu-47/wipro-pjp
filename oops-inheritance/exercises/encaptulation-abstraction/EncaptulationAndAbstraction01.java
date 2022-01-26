class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public char getGender() {
		return this.gender;
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	// getters
	public String getName() {
		return this.name;
	}
	public Author getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQtyInStock() {
		return this.qtyInStock;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

public class EncaptulationAndAbstraction01 {
	public static void main(String[] args) {
		Author author = new Author("Robert Louis Stevenson", "robert@gmail.com", 'M');
		Book book = new Book("Treasure Island", author, 499.00, 17);

		System.out.println("Book Name: " + book.getName());
		System.out.println("Author of book: " + book.getAuthor().getName());
		System.out.println("Book Price: " + book.getPrice() + " rupees");
		System.out.println("Book avaliable in stock: " + book.getQtyInStock());
	}
}
