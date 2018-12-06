
public interface Payment {

	public void assign2PaymentAccount(String userName, String password);

	public boolean checkCustomerData();

	public void link2CustomerBankAccount();

	public boolean performTransaction2BankAccount();

}
