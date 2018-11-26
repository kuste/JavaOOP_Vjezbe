
public class App {

	public static void main(String[] args) {

		CarStore cs = new CarStore(new SimpleCarCreator());
		Car c1 = cs.orderCar("SUV", "BLACK");
		System.out.println(c1.toString());
		
		
		
	}
}
