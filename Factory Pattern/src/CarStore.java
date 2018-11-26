
public class CarStore {
	Car car;

	SimpleCarCreator carCreator;

	public CarStore(SimpleCarCreator scc) {
		this.carCreator = scc;
	}

	public Car orderCar(String type, String color) {

		// Nema new operatora --> nema konkretne instance
		// podignuli smo razinu apstrakcije --> fleksibilniji kod

		Car car = carCreator.createCar(type, color);
		car.manufacture();
		car.paint(color);
		car.deliver();
		return car;

	}
}
