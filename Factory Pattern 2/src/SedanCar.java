
public class SedanCar extends Car {
	public SedanCar() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Sedan EU !!!");
	}
	@Override
	public String toString() {
		return "Order details: a Sedan EU was ordered";
	}

}
