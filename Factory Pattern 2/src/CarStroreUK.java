
public class CarStroreUK extends CarStore {

	@Override
	protected Car createCar(String type, String color) {

		if (type.equals("SUV")) {
			car = new SUVCarUK();
		} else if (type.equals("Sedan")) {
			car = new SedanCarUK();
		} else if (type.equals("Cabriolet")) {
			car = new CabrioletCarUK();
		} else if (type.equals("Hatchback")) {
			car = new HatchbackCarUK();
		} else {

			System.out.println("Not possible to manufacture!!!");
			car = null;
		}

		return car;

	}

}
