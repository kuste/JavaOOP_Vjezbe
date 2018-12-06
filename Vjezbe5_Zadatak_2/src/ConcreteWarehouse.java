
public class ConcreteWarehouse implements Warehouse {

	@Override
	public void invoiceProcessing() {
		System.out.println("Processing data...");

	}

	@Override
	public void findCustomerItems() {
		System.out.println("Finding items...");

	}

	@Override
	public void packingItems() {
		System.out.println("Packing items...");

	}

	@Override
	public void dispachment() {
		System.out.println("Dispaching items...");

	}

}
