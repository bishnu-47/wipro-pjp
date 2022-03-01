import java.util.Optional;

public class OptionalClass02 {
	String address;

	public static void main(String[] args) {
		OptionalClass02 obj = new OptionalClass02();

		Optional<String> opt = Optional.ofNullable(obj.address);
		System.out.println(opt.orElse("India"));
	}
}
