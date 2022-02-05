import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectSerialization {
	public static void main(String[] args) {
		Employee emp = new Employee("Ramesh", new Date(), "IT", "Senior Engineer", 30000);

		// serialization
		try {
			FileOutputStream fileOut = new FileOutputStream("data.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);

			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		// deserialization
		try {
			FileInputStream fileIn = new FileInputStream("data.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Employee e = (Employee) in.readObject();

			System.out.println(e);
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
