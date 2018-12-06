
public class ConcretePayment implements Payment {
	String userName;
	String password;

	@Override
	public void assign2PaymentAccount(String userName, String password) {
		this.userName = userName;
		this.password = password;

	}

	@Override
	public boolean checkCustomerData() {
		if (userName != null && password != null) {
			return true;
		}

		return false;

	}

	@Override
	public void link2CustomerBankAccount() {
		System.out.println("Link established...");

	}

	@Override
	public boolean performTransaction2BankAccount() {

		return true;
	}

}
