
public abstract class CarStore {
	Car car;



	public Car orderCar(String type, String color){
		Car car;

		car = createCar(type, color);
		car.manufacture();
		car.paint(color);
		car.deliver();
		return car;
	}

	protected abstract Car createCar(String type, String color);

}
