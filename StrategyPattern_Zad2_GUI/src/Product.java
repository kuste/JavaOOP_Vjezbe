import java.util.Random;

public abstract class Product {

	protected String name;
	protected int id;
	protected PaymentStrategy ps;

	public Product(String name) {
		this.name = name;
		addID();
	}

	private void addID() {
		Random rnd = new Random();
		this.id = rnd.nextInt(20000) + 10000;
	}

	@Override
	public String toString() {
		return "Product Name = " + name + ", id = " + id;
	}

	public void setPayment(PaymentStrategy ps) {
		this.ps = ps;
		;
	}

	public abstract String pay();

}
