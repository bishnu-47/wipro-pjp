
public class Car implements IVehicle, IFourWheeler {

	@Override
	public void message() {
		IVehicle.super.message();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.message();
	}
}
