
public class SUVCarUK extends Car {
	public SUVCarUK() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Specialized manufacturing processes for SUV UK!!!");
	}

	@Override
	public String toString() {
		return "Order details: a SUV UK was ordered";
	}
}
