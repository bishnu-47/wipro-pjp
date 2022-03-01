
public interface IVehicle {

	default void message() {
		System.out.println("Inside Vehicle.");
	}
}
