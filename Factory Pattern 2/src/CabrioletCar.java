
public class CabrioletCar extends Car {
	
	public CabrioletCar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Cabrio EU!!!");
	}

	@Override
	public String toString() {
		return "Order details: a Cabrio EU was ordered";
	}

}
