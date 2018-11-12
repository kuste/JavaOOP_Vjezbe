
public class HatchbackCar extends Car {
	public HatchbackCar() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Hatchback EU!!!");
	}
	@Override
	public String toString() {
		return "Order details: a Hatchback EU was ordered";
	}

}
