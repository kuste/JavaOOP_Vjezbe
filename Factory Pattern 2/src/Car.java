
public abstract class Car {

	String type;

	public Car() {
		
	}

	public void manufacture() {
		System.out.println("============== Manufacturing car ==============");
		System.out.println("Basic manufacturing process!!!");
	}
	public void paint(String color) {
		System.out.println("Painting car in : " + color);

	}

	public void deliver() {
		System.out.println("Deliver car to the car store...");
	}

}
