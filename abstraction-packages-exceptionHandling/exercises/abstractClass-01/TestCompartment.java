public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] train = new Compartment[10];
		Compartment cmp = null;

		// assign different compartment to train
		for (int i = 0; i < train.length; i++) {
			int rand = (int)(1 + (Math.random() * 4));

			if (rand == 1 ) {
				cmp = new FirstClass();
			} else if (rand == 2) {
				cmp = new General();
			} else if (rand == 3) {
				cmp = new Ladies();
			} else if (rand == 4) {
				cmp = new Luggage();
			}

			train[i] = cmp;
		}

		// print compartment notice
		for (int i = 0; i < train.length; i++) {
			System.out.println(i + 1 + " -> " + train[i].notice());
		}
	}
}
