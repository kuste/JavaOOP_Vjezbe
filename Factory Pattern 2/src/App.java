
public class App {

	public static void main(String[] args) {

		CarStore c1 = new CarStoreEU();
		CarStore c2 = new CarStroreUK();
		
		c1.orderCar("SUV", "Black");
		System.out.println(c1);
		c2.orderCar("SUV", "Black");
		System.out.println(c2);
		c1.orderCar("Cabriolet", "Red");
		System.out.println(c1);
		c2.orderCar("Cabriolet", "Blue");
		System.out.println(c2);
		
		
		Car c3 = new CarStoreEU().orderCar("Sedan", "Yellow");
		System.out.println(c3);
		
		
		
		

	}

}
