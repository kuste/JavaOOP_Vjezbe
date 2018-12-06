
public class ConcreteFacade extends AbsFacade {
	
	public ConcreteFacade() {
		setCustomerAccount(new Account1());
		setPayment(new ConcretePayment());
		setShipping(new ConcreteShipping());
		setWarehouse(new ConcreteWarehouse());
		
	
	}
	
	

	@Override
	void login() {
		customerAccount.assign2Account("ivica", "123");
		customerAccount.checkCustomerData();
	}

	@Override
	void payment() {
		payment.assign2PaymentAccount("paypay", "123");
		payment.checkCustomerData();

	}

	@Override
	void delivery() {
		shipping.roadTransporting();
		shipping.deliveryNotification();

	}

	@Override
	void confirmation() {
		warehouse.invoiceProcessing();
		warehouse.findCustomerItems();
		warehouse.packingItems();
		warehouse.dispachment();
	}

}
