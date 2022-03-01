import java.util.Optional;

public class OptionalClass01 {

	public static void main(String[] args) {
		String[] names= new String[5];

		Optional<String> name = Optional.ofNullable(names[0]);
		if(name.isPresent()) {
			System.out.println(names[0].length());
		}else {
			System.out.println("Null value");
		}
	}
}
