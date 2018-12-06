
public class Account1 implements CustomerAccount {
	String userName;
	String password;

	@Override
	public void assign2Account(String userName, String password) {
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

}
