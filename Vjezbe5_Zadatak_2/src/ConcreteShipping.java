
public class ConcreteShipping implements Shipping {

	@Override
	public void roadTransporting() {

		System.out.println("Truck is on the way...");

	}

	@Override
	public void seaTransportation() {
		System.out.println("Transporting with ship...");

	}

	@Override
	public void airTransportation() {
		System.out.println("Cargo plane is in the air...");

	}

	@Override
	public void deliveryNotification() {

		System.out.println("Your delivery is on the way");

	}

}
