
public abstract class AbsFacade {

	protected CustomerAccount customerAccount;
	protected Payment payment;
	protected Warehouse warehouse;
	protected Shipping shipping;

	abstract void login();

	abstract void payment();

	abstract void delivery();

	abstract void confirmation();

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	
}
