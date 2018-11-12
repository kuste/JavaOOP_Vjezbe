
public class App {

	public static void main(String[] args) {

		CarStore c1 = new CarStoreEU();
		CarStore c2 = new CarStroreUK();
		
		c1.orderCar("SUV", "Black");
		c2.orderCar("SUV", "Black");
		c1.orderCar("Cabriolet", "Red");
		c2.orderCar("Cabriolet", "Blue");
		
		

	}

}
