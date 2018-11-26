
public class SimpleCarCreator {
	Car car;

	public Car createCar(String type, String color){

		if (type.equals("SUV")) {
			car = new SUVCar();
		} else if (type.equals("Sedan")) {
			car = new SedanCar();
		} else if (type.equals("Cabriolet")) {
			car = new CabrioletCar();
		} else if (type.equals("Hatchback")) {
			car = new HatchbackCar();
		} else {

			System.out.println("Not possible to manufacture!!!");
			car = null;
		}

		return car;

	}
}
