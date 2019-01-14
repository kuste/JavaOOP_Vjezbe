
public class Cash implements Payment{
	
	
	public Cash() {
		makePayment();
	}

	@Override
	public void makePayment() {
	System.out.println("Yout payed with cash");
		
	}

	
}
