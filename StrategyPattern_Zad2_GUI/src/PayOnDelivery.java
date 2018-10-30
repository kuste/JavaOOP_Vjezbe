
public class PayOnDelivery implements PaymentStrategy {

	@Override
	public String commitPayment() {
		String s = "You chose payment on delivery. Thank you !";
		return s;
	}
}
