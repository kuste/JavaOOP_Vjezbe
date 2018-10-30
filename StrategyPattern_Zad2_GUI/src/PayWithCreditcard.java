
public class PayWithCreditcard implements PaymentStrategy {

	@Override
	public String commitPayment() {
		String s ="Than you for your purchace with Creditcard";
		return s;
	}
}
