
public class PayWithPayPal implements PaymentStrategy{

	@Override
	public String commitPayment() {
		String s ="Thank you for choosing PayPal.";
		return s;
	}

}
